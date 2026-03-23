package com.cts.config;

import com.cts.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.cts.entity")
public class SpringConfig {
    //Java based configuration
//
//    @Bean("studentOne")
//    public Student student1(){
//        Student student = new Student();
//        student.setAge(20);
//        student.setName("student1");
//        student.setRollNumber(101);
//        return student;
//    }
//
//    @Bean("studentTwo")
//    public Student student2(){
//        Student student = new Student();
//        student.setAge(20);
//        student.setName("student2");
//        student.setRollNumber(102);
//        return student;
//    }


    //Annotation based configuration using Java class


}
