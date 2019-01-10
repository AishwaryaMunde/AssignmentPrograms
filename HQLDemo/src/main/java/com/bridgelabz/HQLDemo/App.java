package com.bridgelabz.HQLDemo;

import java.util.ArrayList;
import java.util.List;
//import java.util.Random;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {    	
    	Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);
    	ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry(); 
    	SessionFactory factory = config.buildSessionFactory(registry);
    	Session session = factory.openSession(); //open session method give the obj of session
    	Transaction transaction = session.beginTransaction();
    	int marks = 25;
    	
    	//Query is used when we work with HQL if we want to work with sql use SQLQuery 
    	//Query query = session.createQuery("select sum(Marks) from Student where Marks > :marks");  // :marks means prepared statement
    																	//as like jdbc we dont need to write here whole statement
    	//query.setParameter("marks",marks);
    	//Object stud = (Object) query.uniqueResult();
    	//System.out.println(stud);
    	
    	
//    	SQLQuery query = session.createSQLQuery("select * from Student");
//    	query.addEntity(Student.class);       //This is for fetching entire rows in table but if we want any perticular column then use 
//    										//query.setResultTransformer(criteria.ALLiAS-To-ADD .....
//    	List<Student> students =query.list();
//    	for(Student student : students)
//    		System.out.println(student);
    	transaction.commit();
    }
}
