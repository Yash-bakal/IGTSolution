package com;

import java.sql.*;
import java.util.*;
class Emp{
	static void insert() {

		int id;
		String name;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root","Sqlreset123@#");
			PreparedStatement pstmt = con.prepareStatement("Insert into emp value(?,?)");
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter ID");
            id=sc.nextInt();
            System.out.println("Enter Name");
            name=sc.next();
            
            pstmt.setInt(1,id);
            pstmt.setString(2,name);
            
            pstmt.execute();
            pstmt.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	static void update() {
		try {
			int id;
			String name;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root","Sqlreset123@#");
			PreparedStatement pstmt = con.prepareStatement("update  emp set name='Demo' where id=?");
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter ID");
            id=sc.nextInt();
//            System.out.println("Enter Name");
//            name=sc.next();
            
            pstmt.setInt(1,id);
  //          pstmt.setString(1,name);
            
            pstmt.execute();
            pstmt.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	static void delete() {
		int id;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root","Sqlreset123@#");
            PreparedStatement pstmt = con.prepareStatement("delete from emp where id=?");
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter ID");
            id=sc.nextInt();
            
            pstmt.setInt(1,id);
            pstmt.execute();
            pstmt.close();
          
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	static void read() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root","Sqlreset123@#");
	        Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * From emp");
		
			while(rs.next()) {
				
			System.out.println(rs.getInt(1)+" :"+rs.getString(2));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	
}


public class Project {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int ch=0;
		do {
			System.out.println("Enter choice : ");
			System.out.println("1. Insert");
			System.out.println("2. Update");
			System.out.println("3. Delete");
			System.out.println("4. Read");
			System.out.println("5. EXIT");
		
			ch=sc.nextInt();
			if(ch==1){
				    Emp.insert();
			   }
			else if(ch==2){
			    Emp.update();
		   }
			else if(ch==3){
			    Emp.delete();
		   }
			else if(ch==4){
			    Emp.read();
		       }		
	    }
		while(ch!=5);
	}
}
