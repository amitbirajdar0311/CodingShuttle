package com.ab.operation;

import com.ab.config.SpringJDBCTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;

public class Select {
    public static void main(String[] args) {

        System.out.println("Select Operation");
        String query = "SELECT * FROM student";
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringJDBCTemplate.class);
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        jdbcTemplate.query(query, (rs) -> {
            System.out.println("Name: " + rs.getString("name"));
            System.out.println("rollNo: " + rs.getInt("rollNo"));
            System.out.println("Age: " + rs.getInt("age"));
        });

        System.out.println("Records selected successfully");
    }
}
