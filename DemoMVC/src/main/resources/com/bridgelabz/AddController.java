package com.bridgelabz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController 
{
	@RequestMapping("/controller")
	public void add()
	{
		System.out.println("Welcome");
	}
}
