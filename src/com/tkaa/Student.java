package com.tkaa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int Rollno;
	private String name;
	private String address;
	private int age;
	private String course;
	private String department;

	public Student() {

	}

	@Override
	public String toString() {
		return "Student [Rollno=" + Rollno + ", name=" + name + ", address=" + address + ", age=" + age + ", course="
				+ course + ", department=" + department + "]";
	}

	public Student(int rollno, String name, String address, int age, String course, String department) {
		super();
		Rollno = rollno;
		this.name = name;
		this.address = address;
		this.age = age;
		this.course = course;
		this.department = department;
	}

	public int getRollno() {
		return Rollno;
	}

	public void setRollno(int rollno) {
		Rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
