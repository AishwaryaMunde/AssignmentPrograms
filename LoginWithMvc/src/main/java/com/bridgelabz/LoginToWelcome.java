package com.bridgelabz;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.bridgelabz.dao.LoginVerify;

@Controller
public class LoginToWelcome extends HttpServlet
{	
	@RequestMapping("/welcome")
	public void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException
	{
		String userName = request.getParameter("userName");
		String userPass = request.getParameter("userPass");
		//System.out.println("data "+userName+ "  "+userPass);
    	if(LoginVerify.databaseConfiguration(userName, userPass))
    	{	    
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Welcome.jsp");
			dispatcher.forward(request, response);		
    	}
    	else
    	{
    		RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
			dispatcher.include(request, response);
    	}
	}
}
