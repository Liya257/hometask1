package com.company;

public class Cat {
    private final int appetite;
    private final String name;
    //private final boolean hungry;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
      //  this.hungry = hungry;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean eat(Plate plate) {
       // System.out.println("Cat eaten!");
       // plate.decreaseFoood(appetite);
        String validMsg = checkEat(plate);
        if( validMsg != null) {
            System.out.println(validMsg);
            return false;
        }

        doEat(plate);
        satiety = true;
        return true;
    }


    public String getName() {
        return name;
    }

    private String checkEat(Plate plate) {
        if( !plate.isFoodEnough(appetite)) {
            return "Food isn't enough!";

        }
        if (satiety) {
            return "Cat is satiety!";
        }
        return null;
    }
    private  void doEat(Plate plate) {
        plate.decreaseFood(appetite);
    }

    public boolean isSatiety() {
        return satiety;
    }
}
