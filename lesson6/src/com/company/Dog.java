package com.company;


public class Dog extends Animal {
    public int run;
    public int swim;
    public Dog(String name, String color, int age, int run, int swim) {
        super(name, color, age);
        this.run = run;
        this.swim = swim;
    }

    public void validRun(int run){
        if(run >=0 && run <= 500){
            System.out.println("");
        }
        else {
            System.out.println(this.name + "run" + this.run +"m");
        }
    }


}
