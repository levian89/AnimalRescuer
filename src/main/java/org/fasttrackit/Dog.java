package org.fasttrackit;

public class Dog extends Pet{

    Food dogsFood;

    public Dog(String name, int healthLevel, Food dogsFood) {
        super(name, healthLevel);
        this.dogsFood = dogsFood;
    }

//    public String toString() {
//        return String.format("name - %s, hungerLevel - %d, favFood - %s", name, hungerLevel, favFood);
//    }
}
