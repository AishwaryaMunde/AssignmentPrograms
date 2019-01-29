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
import com.bridgelabz.utility.SendEmail;

public class UserDatabseImpl implements IUserDatabse
{
	Configuration config = new Configuration().configure().addAnnotatedClass(Userdata.class);
	ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry(); 
	SessionFactory factory = config.buildSessionFactory(registry);
	Session session = factory.openSession(); //open session method give the obj of session
	Transaction transaction = session.beginTransaction();
	public boolean userVerify(String userName , String Password)
	{
		boolean userFound=false;		
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
    	session.close();
    	factory.close();
		return userFound;
	}
	public void save(Userdata userData)
	{
		SendEmail.emailSend();
		System.out.println("User verified");
    	session.save(userData);
    	System.out.println("Registered Suceessfully");
    	transaction.commit();
    	session.close();
    	factory.close();
	}
	public boolean getPassword(String email , String password)
	{
		boolean isEmailIdValid = false; 
		System.out.println("in dao");
		Query query = session.createQuery("select UserName,Password from Userdata where EmailId=:emailid");
		query.setParameter("emailid",email);
		List<Object[]> list = (List<Object[]>) query.list();
		for(Object[] obj : list)
		{
			System.out.println(obj[0]+" : "+obj[1]);
			isEmailIdValid = true;
		}
		Query query1 = session.createQuery("update Userdata set Password=:password where EmailId=:emailid");
		query1.setParameter("emailid",email);
		query1.setParameter("password",password);
		int count = query1.executeUpdate();
		System.out.println(count+" record updated");
    	transaction.commit();
    	session.close();
    	factory.close();
    	return isEmailIdValid;
	}
}