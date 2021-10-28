package com.company;

public class TestCatEating {

    public static void main(String[] args) {
	    Cat cat = new Cat("Barsik", 15, true);
        Plate plate = new Plate(10);

        plate.info();
        if(plate.getFood() > cat.getAppetite()) {
            cat.eat(plate);
            plate.setFood(plate.getFood() - cat.getAppetite());
        }

        plate.info();
    }
}
