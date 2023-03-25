package org.fasttrackit;


import java.time.*;

public class App
{
    public static void main( String[] args )
    {

        Rescuer rescuer1 = new Rescuer("Levi");
        //rescuer1.name = "Levi";
        rescuer1.availableMoneyAmount = 5000;
        System.out.println("Name of the Rescuer: " + rescuer1.name);
        System.out.println("Rescuer's available amount of money: " +rescuer1.availableMoneyAmount);

        Food dogsFood = new Food("Chicken Lasagna");
        Dog dog = new Dog("Cooper",1,dogsFood);
        //dog.name = "Cooper";
        dog.age = 2;
        dog.hungerLevel = 10;
        //dog.hungerLevel = 1;
        dog.moodLevel = 10;
        //dog.favFood = new AnimalsFood("Chicken Lasagna");
        dog.favFood = new Food("Bacon");
        dog.favRecActivity= new RecreationalActivity("Playing fetch");
        System.out.println("Dog's name: " + dog.name);
        System.out.println("Dog's age: " +dog.age);
        System.out.println("Dog's health status: " + dog.healthLevel);
        System.out.println("Dog's level of feeling hungry: " + dog.hungerLevel);
        System.out.println("Dog's mood level: " + dog.moodLevel);
        System.out.println("Dog's favourite food: " + dog.favFood.name);
        System.out.println("Dog's food: " + dog.dogsFood.name);
        System.out.println("Dog's favourite recreational activity: " + dog.favRecActivity.name);

        Cat cat = new Cat("Mia", 3, new Food("Purina"));
        Food catsFood = new Food("Chicken nuggets");
        cat.favFood = catsFood;
        cat.age = 1;
        cat.hungerLevel = 4;
        cat.moodLevel = 2;


        //cat.catsFood = new AnimalsFood("Chicken nuggets");
        cat.favRecActivity= new RecreationalActivity("napping");
        System.out.println("Cat's name: " + cat.name);
        System.out.println("Cat's age: " + cat.age);
        System.out.println("Cat's health status: " + cat.healthLevel);
        System.out.println("Cat's level of feeling hungry: " + cat.hungerLevel);
        System.out.println("Cat's mood level: " + cat.moodLevel);
        System.out.println("Cat's favourite food: " + cat.favFood.name);
        System.out.println("Cat's food: " + cat.catsFood.name);
        System.out.println("Cat's favourite recreational activity: " + cat.favRecActivity.name);

        RecreationalActivity recreationalActivity1 = new RecreationalActivity("hiking");
        //recreationalActivity1.name = "Hiking";
        System.out.println("Recreational activity: " + recreationalActivity1.name);

        //System.out.println(cat.name + "'s hunger feeling level before being fed: " + cat.hungerLevel);
        //System.out.println(cat.name + "'s mood level before being fed: " + cat.moodLevel);
        rescuer1.feed(cat,cat.favFood);
        //System.out.println(cat.name + "'s mood level before doing recreational activity: " + cat.moodLevel);
        rescuer1.entertain(cat.favRecActivity,cat);






        Food animalsFood1 = new Food("Pedigree nuggets");
        //animalsFood1.name = "Pedigree nuggets";
        animalsFood1.price = 50;
        animalsFood1.quantity = 500;
        animalsFood1.expirationDate = LocalDateTime.of(2023,10,31,12,00);
        animalsFood1.stockAvailability = true;
        System.out.println("Name of the animals food: " + animalsFood1.name);
        System.out.println("Price of the food: " + animalsFood1.price);
        System.out.println("Quantity of the food: " + animalsFood1.quantity);
        System.out.println("Stock availability: " + animalsFood1.stockAvailability);
        System.out.println("Expiration date: " + animalsFood1.expirationDate);



        VetDoctor vetDoctor1 = new VetDoctor("Dr. Billy", "Specializing in dogs");
        //vetDoctor1.name = "Dr. Billy";
        //vetDoctor1.specialization = "Specializing in dogs";
        System.out.println("Vet's name: " + vetDoctor1.name);
        System.out.println("Vet's specialization: " + vetDoctor1.specialization);






    }
}
