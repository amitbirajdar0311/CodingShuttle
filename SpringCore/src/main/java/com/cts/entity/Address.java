package com.cts.entity;

public class Address {
    private int pin;
    private String city;

    public int getPin(){
        System.out.println("Inside getPin() method");
        return this.pin;
    }

    public String getCity(){
        System.out.println("Inside getCity() method");
        return this.city;
    }

    public void setPin(int pin){
        System.out.println("Inside setPin() method");
        this.pin = pin;
    }

    public void setCity(String city){
        System.out.println("Inside setCity() method");
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" + "pin=" + pin + ", city=" + city + '}';
    }

    public Address(int pin, String city){
        System.out.println("Inside Address constructor");
        this.pin = pin;
        this.city = city;
    }
    public Address(){
        System.out.println("Inside Non Parameterized Address constructor");
    }
}
