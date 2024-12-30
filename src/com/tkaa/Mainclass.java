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
		 
		 
		 System.out.println("Application is Started....");
	}
}
