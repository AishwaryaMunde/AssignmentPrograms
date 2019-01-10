package com.bridgelabz.SpringIOC;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.service.spi.ServiceRegistryAwareService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//      Vehicle obj = (Vehicle)context.getBean("car");
//      obj.drive();
//    	Tyre tyre = (Tyre)context.getBean("tyre");
//    	System.out.println(tyre);
    	
    	Laptop laptop = (Laptop)context.getBean("laptop");
    	laptop.setLaptopId(101);
    	laptop.setLaptopName("Dell");
    	
//    	Laptop laptop1 = (Laptop)context.getBean("laptop");
//    	laptop1.setLaptopId(102);
//    	laptop1.setLaptopName("Intel");
//
//    	Laptop laptop3 = (Laptop)context.getBean("laptop");
//    	laptop3.setLaptopId(103);
//    	laptop3.setLaptopName("Lenovo");   	
    	
    	
    	EmbededAnotation embed = new EmbededAnotation();
    	embed.setFirstname("Akhil");
    	embed.setMiddlename("Nagarjun");
    	embed.setLastname("Akkineni");
    	Student pojo = (Student)context.getBean("student");    	
    	pojo.setName(embed);
    	pojo.setColor("Sky Blue");
    	pojo.setId(1);
    	
//    	EmbededAnotation embed1 = new EmbededAnotation();
//    	embed1.setFirstname("Aishwarya");
//    	embed1.setMiddlename("Sanjay");
//    	embed1.setLastname("Munde");
//    	Student pojo1 = (Student)context.getBean("student");    	
//    	pojo1.setName(embed1);
//    	pojo1.setColor("Purple");
//    	pojo1.setId(1);
    	
//    	List<Laptop> list = new ArrayList<Laptop>();
//    	list.add(laptop);
//    	list.add(laptop1);
//    	List<Laptop> list1 = new ArrayList<Laptop>();
//    	list1.add(laptop3);
    	
//    	pojo.setLaptop(list);
//    	pojo1.setLaptop(list1);
    	//pojo.setLaptop(list);
    	
    	//pojo.setLaptop(laptop);  //for one to one mapping
    	pojo.getLaptop().add(laptop);   //getLaptop give the array list of laptop //for one to many mapping
    	
    	Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
    	ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry(); 
    	SessionFactory factory = config.buildSessionFactory(registry);
    	Session session = factory.openSession(); //open session method give the obj of session
    	Transaction transaction = session.beginTransaction();
    	session.save(pojo);    //to insert values in database
    	session.save(laptop);
    	//session.save(pojo1);
    	
    	transaction.commit();
    	//pojo = (SpringPojo) session.get(SpringPojo.class,10); //10 is id ie primary key values whose data you wants to fetch
    											//load method is also their to fetch data
    	//System.out.println(pojo);	//fetch values from database
    }
}
