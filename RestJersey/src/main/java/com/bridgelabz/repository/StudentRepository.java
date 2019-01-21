package com.bridgelabz.repository;
//repository class used to fetch the data from the database
//so if you want to fetch data from database write the logic in this class 

import java.util.ArrayList;
import java.util.List;

import com.bridgelaz.model.Student;

public class StudentRepository 
{
	List<Student> list;
	
	public StudentRepository() 
	{
		//To fetch the data from database
		list = new ArrayList<Student>();
		Student student1 = new Student();
		student1.setStudentName("Aishwarya");
		student1.setRollNo(1);
		
		Student student2 = new Student();
		student2.setStudentName("Poonam");
		student2.setRollNo(2);
		
		list.add(student1);
		list.add(student2);
	}	
	
	public List<Student> getStudents()
	{
		return list;
	}
	public Student getStudent(int rollNo)
	{
		for(Student student : list)
		{
			if(student.getRollNo()==rollNo)
			{
				return student;
			}
		}
		return null;
	}
	//Method is used to add the data in database
	public void create(Student student) 
	{
		// TODO Auto-generated method stub
		list.add(student);		
	}
}
