package com.hotel.booking;

import java.util.concurrent.atomic.AtomicInteger;

public class Client {

    private static final AtomicInteger count = new AtomicInteger(0);
    private int personeId;


    public int getPersoneId() {
        return personeId;
    }

    public void setPersoneId(int personeId) {
        this.personeId = personeId;
    }

    private String name;
    private String lastName;
    private String phoneNumber;
    private String email;

    public Client(String name, String lastName, String phoneNumber, String email) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.personeId = count.incrementAndGet();





    }

    public Bill bill2;

    private Bill bill;

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
