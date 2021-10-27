package com.company;


public class Main {

    public static void main(String[] args) {

        Animal cat = new Cat("Barsik","black", 5, 150, 20);
        Animal dog = new Dog("Sharik", "brown", 3,250, 300);

        dog.getInfo();
        System.out.println("=====================================================");
        cat.getInfo();
        System.out.println("=====================================================");

        System.out.println("Number of animals " + Animal.count);
        dog.run();
        cat.run();
        dog.swim();
        cat.swim();


    }
}
