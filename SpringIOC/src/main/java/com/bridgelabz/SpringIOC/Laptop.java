package com.bridgelabz.SpringIOC;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop
{
	@Id
	@Column(name="LaptopId")
	private int laptopId;
	@Column(name="LaptopName")
	private String laptopName;
	
	@ManyToOne
	private Student student;   //for many to one
	
	public int getLaptopId() 
	{
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	public Student getStudent() {      //for many to one
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

}
