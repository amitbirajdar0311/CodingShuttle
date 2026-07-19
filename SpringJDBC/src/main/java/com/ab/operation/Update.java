package com.ab.operation;

import com.ab.config.SpringJDBCTemplate;
import com.ab.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Update {
    public static void main(String[] args) {
        String query = "update student set name=?, age=? where rollNo=?";
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringJDBCTemplate.class);
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        int i = jdbcTemplate.update(query, "Bmit", 25, 3);
        if(i>0)
        {
            System.out.println("Record updated successfully");
        }
        else
        {
            System.out.println("Record update failed");
        }
    }
}
