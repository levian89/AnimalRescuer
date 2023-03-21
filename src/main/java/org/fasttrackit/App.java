package org.fasttrackit;


import java.time.*;

public class App
{
    public static void main( String[] args )
    {

        Rescuer rescuer1 = new Rescuer();
        rescuer1.name = "Levi";
        rescuer1.availableMoneyAmount = 5000;
        System.out.println("Name of the Rescuer: " + rescuer1.name);
        System.out.println("Rescuer's available amount of money: " +rescuer1.availableMoneyAmount);


        Dog dog = new Dog();
        dog.name = "Cooper";
        dog.age = 2;
        dog.healthLevel = 10;
        dog.hungerLevel = 1;
        dog.moodLevel = 10;
        dog.favFood = "Chicken Lasagna";
        dog.favRecActivity = "Playing fetch";
        System.out.println("Dog's name: " + dog.name);
        System.out.println("Dog's age: " +dog.age);
        System.out.println("Dog's health status: " + dog.healthLevel);
        System.out.println("Dog's level of feeling hungry: " + dog.hungerLevel);
        System.out.println("Dog's mood level: " + dog.moodLevel);
        System.out.println("Dog's favourite food: " + dog.favFood);
        System.out.println("Dog's favourite recreational activity: " + dog.favRecActivity);


        AnimalsFood animalsFood1 = new AnimalsFood();
        animalsFood1.name = "Pedigree nuggets";
        animalsFood1.price = 50;
        animalsFood1.quantity = 500;
        animalsFood1.expirationDate = LocalDateTime.of(2023,10,31,12,00);
        animalsFood1.stockAvailability = true;
        System.out.println("Name of the animals food: " + animalsFood1.name);
        System.out.println("Price of the food: " + animalsFood1.price);
        System.out.println("Quantity of the food: " + animalsFood1.quantity);
        System.out.println("Stock availability: " + animalsFood1.stockAvailability);
        System.out.println("Expiration date: " + animalsFood1.expirationDate);

        RecreationalActivity recreationalActivity1 = new RecreationalActivity();
        recreationalActivity1.name = "Hiking";
        System.out.println("Recreational activity: " + recreationalActivity1.name);

        VetDoctor vetDoctor1 = new VetDoctor();
        vetDoctor1.name = "Dr. Billy";
        vetDoctor1.specialization = "Specializing in dogs";
        System.out.println("Vet's name: " + vetDoctor1.name);
        System.out.println("Vet's specialization: " + vetDoctor1.specialization);

    }
}
