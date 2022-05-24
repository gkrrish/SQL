package com.example.streams;

public class Person {
	private String name;
	private String job;
	private Long phoneNumber;

	public Person(String name, String job, Long phoneNumber) {
		this.name = name;
		this.job = job;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getJob() {
		return job;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + ", phoneNumber=" + phoneNumber + "]";
	}

}
