package com.bridgelabz.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.bridgelabz.dao.UserDatabseImpl;
import com.bridgelabz.model.Userdata;
import com.bridgelabz.utility.Encryption;
//import com.bridgelabz.utility.Encryption;

@Controller
public class Registration 
{
	@RequestMapping("/regLogin")
	public ModelAndView registration(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException
	{	
		Userdata userData = new Userdata();
		UserDatabseImpl database = new UserDatabseImpl();
		ModelAndView view = new ModelAndView();
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
		userData.setPassword(Encryption.getMd5(password));
		database.save(userData);
		System.out.println("Registered successfully");
		view.setViewName("index.jsp");
		return view;		
	}
}
