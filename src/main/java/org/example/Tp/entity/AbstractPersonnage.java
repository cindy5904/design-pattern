package org.example.Tp.entity;

public abstract class AbstractPersonnage {
    protected String nom;
    protected int energie;
    protected int pouvoir;

    public AbstractPersonnage nom(String nom) {
        this.nom = nom;
        return this;
    }

    public AbstractPersonnage energie(int energie) {
        this.energie = energie;
        return this;
    }

    public AbstractPersonnage pouvoir(int pouvoir) {
        this.pouvoir = pouvoir;
        return this;
    }

    public abstract Personnage build();
}
