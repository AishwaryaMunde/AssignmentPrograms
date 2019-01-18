package com.bridgelabz.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import com.bridgelabz.model.Userdata;

public class UserDatabseImpl implements IUserDatabse
{
	public boolean userVerify(String userName , String Password)
	{
		boolean userFound=false;
		Configuration config = new Configuration().configure().addAnnotatedClass(Userdata.class);
    	ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry(); 
    	SessionFactory factory = config.buildSessionFactory(registry);
    	Session session = factory.openSession(); //open session method give the obj of session
    	Transaction transaction = session.beginTransaction();
    	Query query = session.createQuery("from Userdata where UserName=:uname and Password=:password");
    	query.setParameter("uname",userName);
    	query.setParameter("password",Password);
    	List list = query.list();
    	if(list != null && list.size()>0)
    	{
    		System.out.println(list);
    		userFound = true;
    	}
    	transaction.commit();
		return userFound;
	}
	public void save(Userdata userData)
	{
		Configuration config = new Configuration().configure().addAnnotatedClass(Userdata.class);
    	ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry(); 
    	SessionFactory factory = config.buildSessionFactory(registry);
    	Session session = factory.openSession(); //open session method give the obj of session
    	Transaction transaction = session.beginTransaction();
    	session.save(userData);
    	transaction.commit();
	}
}