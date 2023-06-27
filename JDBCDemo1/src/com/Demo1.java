package com;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 
public class Demo1 {
    public static void main(String[] args) {    
        // java to Database 
        // 5 steps
        //step  1 load the driver  + add the jar file 
        // step 2 create the connection 
        // create the statement 
        // step 4 is execute the statmente 
        // step 5 is close the connection 
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root", "Sqlreset123@#");
Statement stmt=con.createStatement();
stmt.execute("insert into emp values(400,'Ram')");
stmt.close();
System.out.println("data inserted sucessfully...!");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
 
}