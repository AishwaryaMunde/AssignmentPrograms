package com.bridgelabz.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.bridgelabz.dao.UserDatabase;

@Controller
public class LoginVerify 
{
	@RequestMapping("/login")
	public ModelAndView checkUser(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException
	{		
		String userName = request.getParameter("userName");
		String password = request.getParameter("userPass");
		System.out.println(userName+" "+password);
		UserDatabase user = new UserDatabase();
		ModelAndView view = new ModelAndView();
		if(user.userVerify(userName,password))
		{
			view.setViewName("welcome.jsp");
		}
		else
		{
			view.setViewName("index.jsp");
		}
		return view;		
	}
}