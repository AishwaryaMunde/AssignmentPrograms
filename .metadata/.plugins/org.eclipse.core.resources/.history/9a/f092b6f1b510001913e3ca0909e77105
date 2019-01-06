package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginCheck extends HttpServlet 
{
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
	        throws ServletException, IOException
	{
		LoginDao dao = new LoginDao();
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String name=request.getParameter("userName");  
	    String password=request.getParameter("userPass");  
	          
	    try {
			if(dao.checkDetails(name, password))
			{  
				HttpSession session = request.getSession();
				session.setAttribute("uname", name);
			    RequestDispatcher rd=request.getRequestDispatcher("/welcomeUser.jsp");  
			    rd.forward(request, response);  
			}  
			else
			{   
			    RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");  
			    rd.include(request, response);
			    out.print("Authentication Error"); 			                  
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}  
}
