package com.company;

public class Hospital {
    String name;
    String address;
    String phone;
    Department[] departments;

    public Hospital(String name, String address, String phone, Department[] departments) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.departments = departments;
    }
}
