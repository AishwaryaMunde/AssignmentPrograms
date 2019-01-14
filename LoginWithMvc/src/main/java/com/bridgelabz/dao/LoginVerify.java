package com.bridgelabz.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import com.bridgelabz.pojo.Userdata;

public class LoginVerify 
{
    public static boolean databaseConfiguration(String Username,String Password)
    {    	
    	System.out.println(Username+" "+Password);
    	Configuration config = new Configuration().configure().addAnnotatedClass(Userdata.class);
    	ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry(); 
    	SessionFactory factory = config.buildSessionFactory(registry);
    	Session session = factory.openSession(); //open session method give the obj of session
    	Transaction transaction = session.beginTransaction();
    	
    	Query query = session.createQuery("from Userdata where UserName=:uname and Password=:password");
    																	
    	query.setParameter("uname",Username);
    	query.setParameter("password",Password);
    	//query.setParameter("password",Password);
    	Userdata user = (Userdata) query.uniqueResult();     	
    	System.out.println(user);	 
    	transaction.commit();
		return true;
    }
}
