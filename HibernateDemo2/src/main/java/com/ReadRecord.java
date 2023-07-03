package com;
import java.util.List;
import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import javassist.bytecode.Descriptor.Iterator;

public class ReadRecord {
	 public static void main(String[] args) {

	        Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");

	        SessionFactory factory = cfg.buildSessionFactory();
	       
	        Session session = factory.openSession();

	        Transaction tx = session.beginTransaction();
	        
	        Employee1 e=session.load(Employee1.class, 100);
	        System.out.println("=============");
	        System.out.println("UID :"+e.getUid());
	        System.out.println("U Name :"+e.getName());
//session.save(e);
//session.delete(e);
//session.load(null,session);
//session.update(e);	        
	        
/*          List emp=session.createQuery("from Employee1").list();
	      java.util.Iterator i = emp.iterator();  
	      while(i.hasNext()) {
	    	  Employee1 e=(Employee1)i.next();
	    	  System.out.println(e.getUid());
	    	  System.out.println(e.getName());
	    	  System.out.println(e.getDesig());
	    	  System.out.println("===================");*/
	      }
	 }

