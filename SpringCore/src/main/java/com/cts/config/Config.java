package com.cts.config;

import com.cts.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Student student1(){
        Student student = new Student();
        student.setName("Amit Birajdar");
        student.setAge(23);
        student.setRollNo(4);
        return student;
    }

    @Bean
    public Student student2(){
        Student student = new Student();
        student.setName("Shree Birajdar");
        student.setAge(24);
        student.setRollNo(5);
        return student;
    }
}
