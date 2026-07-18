package com.ab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // Step 1 - Load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 2 - Create a connection
        String url = "jdbc:mysql://localhost:3306/db";
        String username = "root";
        String password = "root";
        Connection con = DriverManager.getConnection(url,username,password);

        // Step 3 - Create a statement
        String name =  "Om";
        int rollNo = 2;
        int age = 19;
        PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?)");
        ps.setString(1,name);
        ps.setInt(2,rollNo);
        ps.setInt(3,age);

        if(ps.executeUpdate()>0){
            System.out.println("Record inserted successfully");
        }
        else{
            System.out.println("Record insertion failed");
        }
        con.close();
        ps.close();
    }
}