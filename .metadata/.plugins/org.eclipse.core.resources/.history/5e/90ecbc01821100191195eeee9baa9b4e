package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeCheck extends HttpServlet
{
	public void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException
	{
		ArrayList list = new ArrayList();
		String username = request.getParameter("uname");
		response.setContentType("text/jsp");
		PrintWriter writer = response.getWriter();
		writer.print("Welcome "+username);
		Cookie cookie[]=request.getCookies();
		for(int i=0;i<cookie.length;i++)
		{
			list.add(cookie[i].getValue());
		}
		String uname = list.get(0).toString();
		String password = list.get(1).toString();
		System.out.println(uname+" "+password);
	}
}
