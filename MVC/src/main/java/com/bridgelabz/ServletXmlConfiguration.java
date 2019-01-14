package com.bridgelabz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration              //to replace first-servlet xml configuration 
@ComponentScan({ "com.bridgelabz" })          //we can multiple pkgs here by giving commas("com.bridgelabz ","com.abc",...)
public class ServletXmlConfiguration
{
	//this class is to remove first-servlet.xml file	/*this method is to file view file*/ 
	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/");    //mention the the that where you want to search the file with extension .jsp or any
		resolver.setSuffix(".jsp");			//in fututre if you change your view file to xhtml or html or any just change extension from here thats it.
		return resolver;
	}
}
