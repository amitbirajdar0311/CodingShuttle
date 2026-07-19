package com.ab.operation;

import com.ab.config.SpringJDBCTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Delete {
    public static void main(String[] args) {
        System.out.println("Delete operation");
        String query = "DELETE FROM student where rollNo=?";
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringJDBCTemplate.class);
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        int i = jdbcTemplate.update(query, 3);
        if(i>0){
            System.out.println("Record deleted successfully");
        }
        else{
            System.out.println("Record deletion failed");
        }
    }
}
