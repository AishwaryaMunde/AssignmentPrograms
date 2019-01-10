package com.bridgelabz.SpringIOC;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Student")
public class Student
{
	@Id
	@Column(name="Id")
	int id;
	@Column(name="Name")
	EmbededAnotation name;
	@Column(name="Color")
	// use @Transient:- annotation if u dont want to create and store values of any column
	String color;
//	@OneToOne                     // this two are for one to one relationship
//	private Laptop laptop;        
	
	@OneToMany		//using mappedBy new table will not create 
	private List<Laptop> laptop = new ArrayList<Laptop>();
	
	public EmbededAnotation getName() {
		return name;
	}
	public void setName(EmbededAnotation name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
		
	//for one to one relationship
//	public Laptop getLaptop() {
//		return laptop;
//	}
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}
	
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	
	@Override
	public String toString() {
		return "SpringPojo [id=" + id + ", name=" + name + ", color=" + color + "]";
	}
	
}
