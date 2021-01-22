package com.springjpaupdatedb.jpaupdatedb.model;

public class StudentMarks {

	private long id;

	private String sub;

	private int marks;

	public StudentMarks() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}
