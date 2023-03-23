package org.fasttrackit;

import java.time.*;

public class AnimalsFood {

    String name;
    int price;
    int quantity;
    LocalDateTime expirationDate;
    boolean stockAvailability;

   public AnimalsFood(String name) {
        this.name = name;
   }
}
