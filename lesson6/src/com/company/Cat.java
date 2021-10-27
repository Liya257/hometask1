package com.company;

import com.company.Animal;

public class Cat extends Animal {
    //static int SWIMMING = 0;
    static int RUNNING = 200;
    public int run;
    public int swim;
    public int count = 0;
    public Cat(String name, String color, int age, int run, int swim) {
        super(name, color, age);
        this.run  = run;
        this.swim = swim;
        count++;
    }

    public void run(){
        if(run >= 0 && run <= RUNNING){
            System.out.println(this.name + "  rinning " + this.run + " m!") ;
        }
        else {
            System.out.println("It is never happened " + this.name + " can't run more than " + RUNNING);
        }
    }
    public void swim(){
        System.out.println(this.name + " can't swim!");
    }

    public void getInfo() {
        System.out.println(this.name + " " + this.color + " " + this.age );
        System.out.println("Created cats: " + count);
    }
}
