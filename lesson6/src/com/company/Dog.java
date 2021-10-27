package com.company;


public class Dog extends Animal {
    static int RUNNING = 500;
    static int SWIMMING = 10;
    public int run;
    public int swim;
    public int count = 0;
    public Dog(String name, String color, int age, int run, int swim) {
        super(name, color, age);
        this.run = run;
        this.swim = swim;
        count++;
    }

    public void run(){
        if(run >=0 && run <= RUNNING){
            System.out.println("Dogs can't run more than " + RUNNING);
        }
        else {
            System.out.println(this.name + " run " + this.run +" m!");
        }
    }
    public void swim(){
        if(swim >= 0 && swim <= SWIMMING){
            System.out.println(this.name + " swim " + this.swim + " m!");
        }
        else {
            System.out.println("It is never happened " + this.name + "can't swim more than " + SWIMMING + "m!");
        }
    }

    public void getInfo(){
        System.out.println(this.name + " " + this.color + " " + this.age );
        System.out.println("Created dogs: " + count);
    }
}
