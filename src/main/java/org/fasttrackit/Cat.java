package org.fasttrackit;

public class Cat extends Pet {

    Food catsFood;

    public Cat(String name, int healthLevel, Food catsFood) {
        super(name, healthLevel);
        this.catsFood = catsFood;
    }

//    public String toString() {
//        return String.format("name - %s, hungerLevel - %d, favFood - %s", name, hungerLevel, favFood);
//    }
}
