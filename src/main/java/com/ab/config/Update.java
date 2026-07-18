package com.ab.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
        PreparedStatement ps = con.prepareStatement("update student set name=? where rollNo=?");
        ps.setString(1, "Jack");
        ps.setInt(2, 1);
        if(ps.executeUpdate()>0){
            System.out.println("Successfully updated");
        }
        else{
            System.out.println("Failed");
        }
    }
}
