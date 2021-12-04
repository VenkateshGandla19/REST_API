package com.boot.rest.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	//@Column(name="studentID")
	private int id;
	//@Column(name="studentName")
	private String name;
	//@Column(name= "marks")
	private int marks;
	
	
	public Student() {
		super();
	}
	
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + id + ", studentName=" + name + ", marks=" + marks + "]";
	}
	

}
