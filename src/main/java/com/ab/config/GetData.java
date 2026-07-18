package com.ab.config;

import java.sql.*;

public class GetData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "root");
        PreparedStatement ps = con.prepareStatement("select * from student");
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            System.out.println("Name: " + rs.getString(1) + ", Roll No: " + rs.getInt(2) + ", Age: " + rs.getInt(3));
        }
    }
}
