package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeCheck extends HttpServlet
{
	public void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException
	{
		String uname = request.getParameter("uname");
		response.setContentType("text/jsp");
		PrintWriter writer = response.getWriter();
		writer.print("Welcome "+uname);
	}
}
