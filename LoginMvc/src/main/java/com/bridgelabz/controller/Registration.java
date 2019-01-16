package com.bridgelabz.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
import com.bridgelabz.dao.UserDatabase;
import com.bridgelabz.model.Userdata;

@Controller
public class Registration 
{
	@RequestMapping("/regLogin")
	public void registration(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException
	{	
		Userdata userData = new Userdata();
		UserDatabase database = new UserDatabase();
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String mobileno = request.getParameter("mobno");
		String emailid = request.getParameter("emailid");
		String userName = request.getParameter("uname");
		String password = request.getParameter("password");
		userData.setFirstName(firstName);
		userData.setLastName(lastName);
		userData.setMobileNo(mobileno);
		userData.setEmailId(emailid);
		userData.setUserName(userName);
		userData.setPassword(password);
		database.save(userData);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
		dispatcher.forward(request, response);
	}
}