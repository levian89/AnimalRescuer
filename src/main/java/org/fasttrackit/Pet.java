package org.fasttrackit;

public class Pet extends Animal{

    int hungerLevel;
    int healthLevel;
    int moodLevel;

    public Pet(String name, int hungerLevel) {
        super(name);
        this.hungerLevel = hungerLevel;
    }
}
