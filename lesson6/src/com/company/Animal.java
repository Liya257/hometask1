package com.company;

public class Animal {

    protected final String name;
    protected final String color;
    protected final int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }


    public void run() {
        System.out.println("Animals might run......");
    }

}
