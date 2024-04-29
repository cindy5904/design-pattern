package org.example.Exercice2;

public class Restaurant {
    private Dish dish;
    private Ingredient ingredient;
    private CookingUstensil cookingUstensil;


    public Restaurant(CuisineFactory factory) {
         dish = factory.creacteDish();
         ingredient = factory.createIngredient();
         cookingUstensil = factory.createCookingUstensil();

    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "dish=" + dish +
                ", ingredient=" + ingredient +
                ", cookingUstensil=" + cookingUstensil +
                '}';
    }

    public void prepareDinner() {
        ingredient.prepare();
        dish.serve();
        cookingUstensil.use();

    }


}
