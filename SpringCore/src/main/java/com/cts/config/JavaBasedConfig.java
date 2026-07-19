package com.cts.config;

import com.cts.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaBasedConfig {
    public static void main(String[] args) {
        // Java Based Configuration

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Student stu1 = context.getBean("student1", Student.class);
        System.out.println(stu1);
        Student stu2 = context.getBean("student2", Student.class);
        System.out.println(stu2);


    }
}
