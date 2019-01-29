package com.bridgelabz.RestJersey;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.bridgelabz.repository.StudentRepository;
import com.bridgelaz.model.Student;

@Path("/students")
public class StudentResource 
{
	StudentRepository repository = new StudentRepository();
	//Method is to fetch the data from database
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Student> getStudent()
	{		
		return repository.getStudents();
	}
	//To add the data in database	
	@POST
	@Path("/student")
	public Student addData(Student student)
	{
		System.out.println(student);
		repository.create(student);
		return student;
	}
}