package com.springjpaupdatedb.jpaupdatedb.model;

public class StudentData {

	private long sid;

	private String name;

	private int age;

	public StudentData() {

	}

	public long getId() {
		return sid;
	}

	public void setId(long sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
