package com.cts.entity;


public class Address {

    private String city;
    private String state;


    public void setCity(String city) {
        System.out.println("setting City: " + city);
        this.city = city;
    }

    public void setState(String state) {
        System.out.println("setting State: " + state);
        this.state = state;
    }

    public String getCity() {
        System.out.println("getting City: " + city);
        return this.city;
    }

    public String getState() {
        System.out.println("getting State: " + state);
        return this.state;
    }

    public Address() {
        System.out.println("Default Constructor called of Address");
    }
    public Address(String city, String state) {
        System.out.println("Constructor called with city: " + city + ", state: " + state);
        this.city = city;
        this.state = state;
    }
    @Override
    public String toString() {
        return "Address{" + "city=" + city + ", state=" + state + '}';
    }
}
