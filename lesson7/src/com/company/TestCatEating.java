package com.company;

import java.util.Scanner;

public class TestCatEating {

    public static void main(String[] args) {
	    /*Cat cat = new Cat("Barsik", 15);
        Plate plate = new Plate(10);

        plate.info();
        if(plate.getFood() > cat.getAppetite()) {
            cat.eat(plate);
           // plate.setFood(plate.getFood() - cat.getAppetite());
        }

        plate.info();*/


        /*Cat cat1 = new Cat("Barsik",5);
        Cat cat2 = new Cat("Murka", 6);
        Cat cat3 = new Cat("Sam", 3);
        Cat[] cats = {cat1, cat2, cat3};*/

        Cat[] cats = {
                new Cat("Barsik", 3),
                new Cat("Tosha", 5),
                new Cat("Musya",2),
        };


        Plate plate = new Plate(12);

        printInfo(cats, plate);
        haveEat(cats, plate);

        printInfo(cats, plate);
        addFood(plate);
        System.out.println("Add food on the plate: ");
        plate.info();

        haveEat(cats,plate);
        printInfo(cats, plate);



    }
    private static void addFood(Plate plate){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter food count: ");
        int foodCount = scanner.nextInt();
        plate.addFood(foodCount);
    }
    private static void printInfo(Cat[] cats, Plate plate) {
        System.out.println("Information about cats: ");
        plate.info();
        printInfo(cats);
        System.out.println("====================");


    }

    private static void haveEat(Cat[] cats, Plate plate) {
        for (Cat cat: cats) {
            boolean res = cat.eat(plate);
            System.out.println("Cat " + cat.getName()  + "  eat? Answer: " + res);
        }
        System.out.println();
    }
    private static void printInfo(Cat... cats) {
        for (Cat cat: cats) {
            System.out.println("Cat " + cat.getName() + "(appetite:" + cat.getAppetite() + ") Answer: " + !cat.isSatiety());
        }
    }
}
