package org.example.Exercice2;

public class Restaurant {
    private Dish dish;
    private Ingredient ingredient;
    private CookingUstensil cookingUstensil;


    public Restaurant(CuisineFactory factory) {
         dish = factory.creacteDish();

    }


}
