package org.fasttrackit;

import java.time.*;

public class Food {

    String name;
    int price;
    int quantity;
    LocalDateTime expirationDate;
    boolean stockAvailability;

    public Food(String name) {
        this.name = name;
    }

//    public String toString() {
//        return String.format("name - %s", name);
//    }
}
