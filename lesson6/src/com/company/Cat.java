package com.company;

import com.company.Animal;

public class Cat extends Animal {
    public int run;
    public int swim;
    public Cat(String name, String color, int age, int run, int swim) {
        super(name, color, age);
        this.run  = run;
        this.swim = swim;
    }
}
