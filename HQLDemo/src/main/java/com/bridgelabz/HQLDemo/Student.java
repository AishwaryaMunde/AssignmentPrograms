package com.bridgelabz.HQLDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
	private String Name;
	@Id
	private int Rollno;
	private int Marks;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", Rollno=" + Rollno + ", Marks=" + Marks + "]";
	}
}
