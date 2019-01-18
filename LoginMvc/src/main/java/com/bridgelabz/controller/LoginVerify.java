package com.bridgelabz.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.bridgelabz.dao.UserDatabseImpl;
import com.bridgelabz.utility.Encryption;

@Controller
public class LoginVerify 
{
	@RequestMapping("/login")
	public ModelAndView checkUser(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException
	{		
		String userName = request.getParameter("userName");
		String password = request.getParameter("userPass");
		String encryptPassword = Encryption.getMd5(password);
		System.out.println(userName+" "+password);
		UserDatabseImpl user = new UserDatabseImpl();
		ModelAndView view = new ModelAndView();
		if(user.userVerify(userName,encryptPassword))
		{
			HttpSession session = request.getSession();
			session.setAttribute("userName",userName);
			view.setViewName("welcome.jsp");
		}
		else
		{
			view.setViewName("index.jsp");
		}
		return view;		
	}
}