package com;

import java.util.Iterator;
import java.util.List; // Correct import for List
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

 

public class UpdateRecord {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

     // Read employee ID from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        int uid = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

 

        // Retrieve the employee record to update
        EmployeeIGT employee = session.get(EmployeeIGT.class, uid);
        if (employee == null) {
            System.out.println("Employee with ID " + uid + " not found.");
            tx.rollback();
            session.close();
            factory.close();
            return;
        }
        System.out.print("Enter Salary: ");
        int salary = scanner.nextInt();
        employee.setSalary(salary);
 

        // Read new name and design from user
//        System.out.print("Enter new name: ");
//        String newName = scanner.nextLine();
//        System.out.print("Enter new design: ");
//        String newDesign = scanner.nextLine();

 

        // Update the employee record
//        employee.setName(newName);
//        employee.setDesig(newDesign);
        session.update(employee);
        tx.commit();

 

        System.out.println("Record updated successfully.");

 

        scanner.close();
        session.close();
        factory.close();
    }
}