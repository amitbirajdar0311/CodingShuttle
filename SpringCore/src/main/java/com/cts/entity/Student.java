package com.cts.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("${config.name}")
    private String name;
    @Value("${config.age}")
    private int age;
    @Value("${config.rollNo}")
    private int rollNo;

    //Getter and Setter methods
    public String getName(){
        System.out.println("Inside getName() method");
        return this.name;
    }
    public int getAge(){
        System.out.println("Inside getAge() method");
        return this.age;
    }
    public int getRollNo(){
        System.out.println("Inside getRollNo() method");
        return this.rollNo;
    }
    public void setName(String name){
        System.out.println("Inside setName() method");
        this.name = name;
    }
    public void setAge(int age){
        System.out.println("Inside setAge() method");
        this.age = age;
    }
    public void setRollNo(int rollNo){
        System.out.println("Inside setRollNo() method");
        this.rollNo = rollNo;
    }

    @Override
    public String toString(){
        return "Name: " + name + " age: " + age + " rollNo: " + rollNo;
    }
}
