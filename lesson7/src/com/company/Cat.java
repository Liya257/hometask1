package com.company;

public class Cat {
    private final int appetite;
    private final String name;
    private final boolean hungry;

    public Cat(String name, int appetite, boolean hungry) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = hungry;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate plate) {
        System.out.println("Cat eaten!");
        plate.decreaseFoood(appetite);

    }

    public String getName() {
        return name;
    }
}
