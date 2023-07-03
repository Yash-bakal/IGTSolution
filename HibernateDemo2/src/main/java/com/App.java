package com;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

 

public class App {

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
        
        System.out.println("Enter Name");
        String uname= sc.next();
        
        System.out.println("Enter Designation");
        String desig= sc.next();
        
        e.setUid(uid);
        e.setName(uname);
        e.setDesig(desig);

        session.save(e);
        tx.commit();

        System.out.println("Inserted");
    }

 

}