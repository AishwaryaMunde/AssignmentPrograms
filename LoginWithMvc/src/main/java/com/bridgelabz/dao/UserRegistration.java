package com.bridgelabz.dao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bridgelabz.pojo.Userdata;

@Controller
public class UserRegistration extends HttpServlet 
{
	@RequestMapping("/regLogin")
	public void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException
	{
		Configuration config = new Configuration().configure().addAnnotatedClass(Userdata.class);
    	ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry(); 
    	SessionFactory factory = config.buildSessionFactory(registry);
    	Session session = factory.openSession(); //open session method give the obj of session
    	Transaction transaction = session.beginTransaction();
    	Userdata data = new Userdata();
    	String firstName = request.getParameter("firstname");
    	String lastName = request.getParameter("lastname");
    	String mobno = request.getParameter("mobno");
    	String emailid = request.getParameter("emailid");
    	String userName = request.getParameter("uname");
    	String password = request.getParameter("password");
    	data.setFirstName(firstName);
    	data.setLastName(lastName);
    	data.setMobileNo(mobno);
    	data.setEmailId(emailid);
    	data.setUserName(userName);
    	data.setPassword(password);
    	session.save(data);
    	RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
    	dispatcher.forward(request, response);
    	transaction.commit();
	}
}
