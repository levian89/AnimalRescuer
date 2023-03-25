package org.fasttrackit;

public class Rescuer {

    String name;
    int availableMoneyAmount;


    public Rescuer(String name) {
        this.name = name;
    }

    public void feed(Animal animal, Food food) {

        //Levi just gave some Purina food to Mia
        System.out.println(animal.name + "'s hunger feeling level before being fed: " + animal.hungerLevel);
        System.out.println(animal.name + "'s mood level before being fed: " + animal.moodLevel);
        System.out.println(name + " just gave some " + food.name + " food to " + animal.name);
        animal.hungerLevel --;
        System.out.println(animal.name + "'s new level of hunger feeling: " + animal.hungerLevel);

        if(food.name == animal.favFood.name) {
           animal.moodLevel++;
            System.out.println(animal.name + "'s new mood level: " + animal.moodLevel);
        }
    }

    public void entertain(RecreationalActivity recreationalActivity, Animal animal) {

        //Levi has done some hiking with Mia
        System.out.println(animal.name + "'s mood level before doing recreational activity: " + animal.moodLevel);
        System.out.println(name + " has done some " + recreationalActivity.name + " with " + animal.name);

        if (recreationalActivity.name == animal.favRecActivity.name) {
            animal.moodLevel+=2;
        } else {
            animal.moodLevel++;
        }
        System.out.println(animal.name + "'s new mood level: " + animal.moodLevel);
    }

    //public String toString() {
      //  return String.format("name - %s", name);
    //}
}
