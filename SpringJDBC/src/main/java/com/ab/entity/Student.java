package com.ab.entity;

public class Student {

    private String name;
    private int rollNo;
    private int age;


    public String getName() {
        System.out.println("Inside getName() method");
        return name;
    }

    public void setName(String name) {
        System.out.println("Inside setName() method");
        this.name = name;
    }

    public int getRollNo() {
        System.out.println("Inside getRollNo() method");
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        System.out.println("Inside setRollNo() method");
        this.rollNo = rollNo;
    }

    public int getAge() {
        System.out.println("Inside getAge() method");
            return age;
    }

    public void setAge(int age) {
        System.out.println("Inside setAge() method");
        this.age = age;
    }

}
