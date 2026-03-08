package com.cts.entity;



public class Student {
    private String name;
    private int age;

    public Student() {
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        System.out.println("Student getName");
        return name;
    }
    public void setName(String name) {
        System.out.println("Student setName");
        this.name = name;
    }

    public int getAge() {
        System.out.println("Student getAge");
        return age;
    }
    public void setAge(int age) {
        System.out.println("Student setAge");
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}
