package org.example.Exercice2;

public abstract class Dish {
    private String nomDish;

    public Dish(String nomDish) {
        this.nomDish = nomDish;
    }

    public Dish serve() {
        this.nomDish = nomDish;
        return this;
    }
}
