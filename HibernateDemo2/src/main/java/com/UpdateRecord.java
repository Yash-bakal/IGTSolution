package com;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class UpdateRecord {
	 public static void main(String[] args) {

	        Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");

	        SessionFactory factory = cfg.buildSessionFactory();
	        Session session = factory.openSession();

	        Transaction tx = session.beginTransaction();

	        Employee1 e = new Employee1();
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter id");
	        int uid= sc.nextInt();
	        
	        System.out.println("Update Designation");
	        String desig= sc.next();
	        
	        e.setUid(uid);
	        e.setDesig(desig);
	   
	        session.update(e);
	        tx.commit();

	        System.out.println("Updated");
	    }
}
