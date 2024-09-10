package com.Entity;

public class Student implements Comparable<Student>{

	private int roll;
	private String name;
	private int marks;
	private String add;
	
	public Student() {
		super();
	}
	
	public Student(int roll, String name, int marks, String add) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.add = add;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
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

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public int compareTo(Student s)
	{
		return Integer.compare(this.getRoll(),s.getRoll());
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
	
	
}
