package com.ab.operation;

import com.ab.config.SpringJDBCTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.Map;

public class Insert {
    public static void main(String[] args) {

        // Insert operation
        System.out.println("Insert operation");
//        String name = "Amit";
//        int rollNo = 3;
//        int age = 24;

//        String query = "insert into student(name,rollNo,age) values(?,?,?)";

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringJDBCTemplate.class);
//        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
//        int i = jdbcTemplate.update(query, name, rollNo, age);

        //NamedParameterJDBC template
        NamedParameterJdbcTemplate namedParameterJdbcTemplate = context.getBean(NamedParameterJdbcTemplate.class);
        Map<String,Object> map = new HashMap<>();
        map.put("key_name" , "Amit");
        map.put("key_rollNo" , 123);
        map.put("key_age" , 456);
        String query = "insert into student(name,rollNo,age) values(:key_name , :key_rollNo , :key_age)";

        int i =  namedParameterJdbcTemplate.update(query,map);
        if(i>0){
            System.out.println("Record inserted successfully");
        }
        else{
            System.out.println("Record insertion failed");
        }
    }
}

