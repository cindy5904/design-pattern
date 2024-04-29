package org.example.Exercice2;

public abstract class Ingredient {
    private String nom;

    public Ingredient(String nom) {
        this.nom = nom;
    }

    public Ingredient prepare() {
        this.nom = nom;
        return this;
    }
}
