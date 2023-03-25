package org.fasttrackit;

public class Pet extends Animal{


    int healthLevel;


    public Pet(String name, int healthLevel) {
        super(name);
        this.healthLevel = healthLevel;
    }

    //public String toString() {
      //  return String.format("name - %s, hungerLevel - %d", name, hungerLevel);
    //}
}
