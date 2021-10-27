package com.company;

public class Animal {

    protected final String name;
    protected final String color;
    protected final int age;
    static int count = 0;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        count++;
    }


    public void run() { }
    public void swim(){  }
    public void getInfo(){ }

}
