package com.example.objectpool;

public class DummpImplementation<T> extends ObjectPool<T>{

	@Override
	protected T create() {
		return null;
	}

	@Override
	protected boolean validate(T o) {
		return false;
	}

	@Override
	public void expire(T o) {
		
	}

}
