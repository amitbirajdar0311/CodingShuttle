package com.cts.config;

import com.cts.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBasedConfig {
    public static void main(String[] args) {
        // XML based Configuration

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student stu = context.getBean("student1", Student.class);
        System.out.println(stu);

        Student stu1 = context.getBean("student2", Student.class);
        System.out.println(stu1);
    }
}
