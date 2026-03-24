package com.cts.config;

import com.cts.entity.Address;
import com.cts.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan(basePackages = "com.cts.entity")

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

//    Setter DI
//
//    @Bean
//    public Address addressObj(){
//        Address address = new Address();
//        address.setCity("pune");
//        address.setState("maharashtra");
//        return address;
//    }
//
//    @Bean
//    public Student studentObj(){
//        Student student = new Student();
//        student.setRollNumber(1);
//        student.setAge(24);
//        student.setName("Amit Birajdar");
//        student.setAddress(addressObj());
//        return student;
//    }

//    Constructor DI

    @Bean
    public Address addressObj(){
        return new Address("pune", "maharashtra");
    }
    @Bean
    public Student studentObj(){
        return new Student("Amit",23,3,addressObj());
    }
}
