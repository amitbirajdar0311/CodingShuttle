package com.cts.config;

import com.cts.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationConfig {
    public static void main(String[] args) {
        // Annotation based Configuration
//
//        ApplicationContext context = new ClassPathXmlApplicationContext("componentScan.xml");
//        Student student = (Student) context.getBean("student");
//        System.out.println(student);

        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationBasedConfig.class);
        Student student = context.getBean(Student.class);
        System.out.println(student);
    }
}
