package com.bridgelabz.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Logout 
{
	@RequestMapping("/logout")
	public ModelAndView logout(HttpServletResponse response)
	{		
		ModelAndView view = new ModelAndView();
		view.setViewName("index.jsp");	
		return view;
	}
}