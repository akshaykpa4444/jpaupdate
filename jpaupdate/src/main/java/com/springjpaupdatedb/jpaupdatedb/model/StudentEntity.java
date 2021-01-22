package com.springjpaupdatedb.jpaupdatedb.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "student")
@IdClass(value = NameId.class)
public class StudentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String name;

	private int age;

	@Id
	private String sub;

	private int marks;

	public StudentEntity() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", age=" + age + ", sub=" + sub + ", marks=" + marks
				+ "]";
	}

}
