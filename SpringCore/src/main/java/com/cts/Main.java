package com.cts;

import com.cts.config.SpringConfig;
import com.cts.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//          ------------> XML based Configuration ----------------------------
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Student student1 = context.getBean("student1", Student.class);
//        System.out.println(student1);
//
//        // second student
//        Student student2 = context.getBean("student2", Student.class);
//        System.out.println(student2);

//        -------------> Java based Configuration ----------------------------
//        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        Student student1 = context.getBean("studentOne", Student.class);
//        System.out.println(student1);
//
//        System.out.println("-----------------------------");
//        Student student2 = context.getBean("studentTwo", Student.class);
//        System.out.println(student2);



//        Annotation based configuraiton using XML
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Student student =  context.getBean(Student.class);
//        System.out.println(student);


//        ------------> Annotation based configuration using Java class ----------------------------
//        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        Student student = context.getBean(Student.class);
//        System.out.println(student);


//        now Working on Setter Dependency Injection

//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Student student = context.getBean(Student.class);
//        System.out.println(student);


//        Setter DI java based


        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) context.getBean("studentObj");
        System.out.println(student);
    }


}