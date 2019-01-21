package com.bridgelaz.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student
{
	private String studentName;
	private int rollNo;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", rollNo=" + rollNo + "]";
	}
}
