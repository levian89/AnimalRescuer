package org.fasttrackit;

public class Dog extends Pet{
    AnimalsFood favFood;
    AnimalsFood dogsFood;
    RecreationalActivity favRecActivity;

    public Dog(String name, int hungerLevel, AnimalsFood favFood) {
        super(name, hungerLevel);
        this.favFood = favFood;
    }
}
