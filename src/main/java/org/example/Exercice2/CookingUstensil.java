package org.example.Exercice2;

public abstract class CookingUstensil {

    private String nomUstensil;

    public CookingUstensil(String nomUstensil) {
        this.nomUstensil = nomUstensil;
    }

    public CookingUstensil use() {
        this.nomUstensil = nomUstensil;
        return this;
    }
}
