package com.company;

import java.text.MessageFormat;

public class Employee {
    private String NSL;//name+surname+lastname
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String NSL, String position, String email, String phoneNumber, int salary, int age){

        this.NSL = NSL;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
        getInformEmployee();

    }


    public String getInformEmployee(){
        String info = "NSL: {0}, position: {1}, email: {2}, phoneNumber: {3}, salary: {4}, age: {5}";
        return MessageFormat.format(info, this.NSL, this.position, this.email, this.phoneNumber, this.salary, this.age);
    }

    public String GetNSL(){
        return NSL;
    }
    public void setNSL(String NSL) {
        this.NSL = NSL;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary  = salary;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
