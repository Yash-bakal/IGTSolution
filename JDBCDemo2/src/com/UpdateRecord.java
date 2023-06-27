package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateRecord {

	 public static void main(String[] args) {
	        try
	        {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root","Sqlreset123@#");
	        //    Statement stmt=con.createStatement();
	            //stmt.execute("insert into employee values (666,'shital',23,65000,'Manager')");
	            PreparedStatement  pstmt=con.prepareStatement("update employee set Salary= ? where id =?"); 

	            Scanner sc=new Scanner(System.in);
	            System.out.print("Enter id : ");
	            int id=sc.nextInt();

	            System.out.print("Enter salary : ");
	            int salary=sc.nextInt();
              
	            pstmt.setInt(1, salary);
	            pstmt.setInt(2, id);
	            
	            pstmt.execute();
                pstmt.close();
	            System.out.println("data updated successfully.....");    
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);    
	        }


}
}
