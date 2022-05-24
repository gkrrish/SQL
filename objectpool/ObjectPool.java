package com.example.objectpool;

import java.util.Enumeration;
import java.util.Hashtable;

public abstract class ObjectPool<T> {
	private Long expirationTime;

	private Hashtable<T, Long> locked;
	private Hashtable<T, Long> unLocked;

	protected ObjectPool() {// best use case for protected
		expirationTime = 30000l; // 30 seconds
		locked = new Hashtable<>();
		unLocked = new Hashtable<>();
	}

	protected abstract T create();

	protected abstract boolean validate(T o);

	protected abstract void expire(T o);

	public synchronized T checkOut() {
		long now = System.currentTimeMillis();
		T t;
		if (unLocked.size() > 0) {
			Enumeration<T> e = unLocked.keys();
			while (e.hasMoreElements()) {
				t = e.nextElement();

				if ((now - unLocked.get(t)) > expirationTime) {// objects has expired
					unLocked.remove(t);
					expire(t);
					t = null;
				} else {
					if (validate(t)) {
						unLocked.remove(t);
						locked.put(t, now);
						return (t);
					} else {// Object failed validation
						unLocked.remove(t);
						expire(t);
						t = null;
					}
				}
			}
		} // no objects are available, create new one
		t = create();
		locked.put(t, now);
		return t;
	}

	public synchronized void checkIn(T t) {
		locked.remove(t);
		unLocked.put(t, System.currentTimeMillis());
	}
}

//https://sourcemaking.com/design_patterns/object_pool/java
//HashTable is synchronized and HashMap is not synchronized
