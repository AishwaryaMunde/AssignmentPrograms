package com.bridgelabz.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Logout 
{
	/**This method give the view file after logging out that is index file
	 * @param response is used to send the response to the client
	 * @return the object of ModelAndView class
	 */
	@RequestMapping("/logout")
	public ModelAndView logout(HttpServletResponse response)
	{		
		ModelAndView view = new ModelAndView();
		view.setViewName("index.jsp");	  //after logout returning to index file
		return view;
	}
}