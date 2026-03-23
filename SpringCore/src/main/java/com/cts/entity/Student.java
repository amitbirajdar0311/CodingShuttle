package com.cts.entity;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("Amit Birajdar")
    private String name;
    @Value("23")
    private int age;
    @Value("101")
    private int rollNumber;

    public void setName(String name) {
        System.out.println("setting Name: " + name);
        this.name = name;
    }
    public void setAge(int age) {
        System.out.println("setting Age: " + age);
        this.age = age;
    }

    public void setRollNumber(int rollNumber) {
        System.out.println("setting Roll Number: " + rollNumber);
        this.rollNumber = rollNumber;
    }

    public String getName() {
        System.out.println("getting Name: " + name);
        return name;
    }
    public int getAge() {
        System.out.println("getting Age: " + age);
        return age;
    }
    public int getRollNumber() {
        System.out.println("getting Roll Number: " + rollNumber);
        return rollNumber;
    }
    public Student(){
        System.out.println("Default Constructor called");
    }

    public Student(String name, int age , int rollNumber){
        System.out.println("Constructor called with name: " + name + ", age: " + age + ", rollNumber: " + rollNumber);
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", rollNumber=" + rollNumber + "]";
    }
}
