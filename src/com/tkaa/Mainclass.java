package com.tkaa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Mainclass {

	public static void main(String[] args) {
		
		 Configuration cfg = new Configuration();
		 cfg.configure("hibernate.cfg.xml");
		 cfg.addAnnotatedClass(Student.class);
		 SessionFactory sf = cfg.buildSessionFactory();
		 Session ss = sf.openSession();
		 Transaction tr = ss.beginTransaction();
		 
		 Student s = new Student();
		 s.setRollno(1);
		 s.setName("Atharva");
		 s.setAddress("Pune");
		 s.setAge(22);
		 s.setCourse("B. Tech");
		 s.setDepartment("Computer");
		 
		 ss.save(s);
		 System.out.println(s);
		 tr.commit();
		 ss.close();
		 
		 
		 System.out.println("Application is Started....");
	}
}
