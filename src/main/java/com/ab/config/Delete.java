package com.ab.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
        PreparedStatement ps = con.prepareStatement("delete from student where name = ?");
        ps.setString(1, "Jack");
        if(ps.executeUpdate()>0){
            System.out.println("Successfully deleted");
        }
        else{
            System.out.println("Failed");
        }
        ps.close();
        con.close();
    }
}
