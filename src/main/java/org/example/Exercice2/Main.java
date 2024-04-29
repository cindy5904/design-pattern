package org.example.Exercice2;

public class Main {
    public static void main(String[] args) {
        Restaurant  restaurantItalien = new Restaurant(new ItalianCuisineFactory());
        restaurantItalien.prepareDinner();


    }
}
