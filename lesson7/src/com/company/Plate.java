package com.company;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFoood(int countFood) {
        if (countFood <= food){
            this.food -= countFood;
        }else{
            System.out.println("Cat can't eat");
        }
    }
    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}
