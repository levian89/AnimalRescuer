package org.fasttrackit;

public class Cat extends Pet {
    AnimalsFood favFood;
    AnimalsFood catsFood;
    RecreationalActivity favRecActivity;


    public Cat(String name, int hungerLevel, AnimalsFood favFood) {
        super(name, hungerLevel);
        this.favFood = favFood;
    }
}
