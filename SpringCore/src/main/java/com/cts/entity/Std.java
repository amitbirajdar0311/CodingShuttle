package com.cts.entity;

public class Std {
    private int id;
    private String name;
    private Address address;

    public int getId(){
        System.out.println("Inside getId() method");
        return this.id;
    }
    public String getName(){
        System.out.println("Inside getName() method");
        return this.name;
    }
    public  Address getAddress(){
        System.out.println("Inside getAddress() method");
        return this.address;
    }

    public void setId(int id){
        System.out.println("Inside setId() method");
        this.id = id;
    }
    public void setName(String name){
        System.out.println("Inside setName() method");
        this.name = name;
    }
    public void setAddress(Address address){
        System.out.println("Inside setAddress() method");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Std [id=" + id + ", name=" + name + ", address=" + address + "]";
    }

    public Std(int id, String name, Address address){
        System.out.println("Inside Std constructor");
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public Std(){
        System.out.println("Inside Std constructor non-parameterized");
    }
}
