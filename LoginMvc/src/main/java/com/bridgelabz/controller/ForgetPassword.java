package com.bridgelabz.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bridgelabz.dao.UserDatabseImpl;
import com.bridgelabz.utility.Encryption;

@Controller
public class ForgetPassword 
{
	@RequestMapping("/forget")
	public ModelAndView forgetPassword(HttpServletRequest request , HttpServletResponse response) throws Exception
	{
		ModelAndView view = new ModelAndView();
		PrintWriter writer = response.getWriter();
		Encryption encrypt = new Encryption();;
		String email = request.getParameter("email");
		String newPasswd = request.getParameter("newPassword");
		String reEnterPassword = request.getParameter("reenterPassword");
		System.out.println(email);
		UserDatabseImpl data = new UserDatabseImpl();
		String newPasswdEncrypt = encrypt.getMd5(newPasswd);
		if(data.getPassword(email,newPasswdEncrypt) && newPasswd.equals(reEnterPassword))
		{						
			System.out.println("Encrypted : "+newPasswdEncrypt);
			view.setViewName("index.jsp");
		}
		else
		{
			view.setViewName("forgetPasswd.jsp");
		}
		return view;
	}
}
