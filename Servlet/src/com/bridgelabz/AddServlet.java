package com.bridgelabz;

import java.net.HttpRetryException;

public class AddServlet extends
{
	public void service(HttpRetryException)
	{
		int firstNum = Integer.parseInt(request.getParameter("num1"));
		int secondNum = Integer.parseInt(request.getParameter("num2"));
		int addition = firstNum + secondNum;
		System.out.println("Addition : "+addition);
	}
}
