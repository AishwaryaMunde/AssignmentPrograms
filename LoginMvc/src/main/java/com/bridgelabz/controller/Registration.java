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
import com.bridgelabz.utility.SendEmail;

@Controller
public class Registration 
{
	/**This method is used to register the user and store user data in database using hibernate
	 * @param request is to fetch the data entered by user while registering to login 
	 * @param response is to give response to client for request
	 * @return view file 
	 * @throws ServletException it occur while is their any problem while fetching the data
	 * @throws IOException is occur if entered input is in invalid format
	 */
	@RequestMapping("/regLogin")
	public ModelAndView registration(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException
	{	
		Userdata userData = new Userdata();		//initialize pojo class
		
		UserDatabseImpl database = new UserDatabseImpl();
		ModelAndView view = new ModelAndView();
		//fetching data from web
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
		//save the password in database in encrypted format
		userData.setPassword(Encryption.getMd5(password));
		database.save(userData);	//this method store the data in database		
		view.setViewName("verify.jsp");
		return view;		
	}
}
