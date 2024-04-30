package org.example.Tp.entity;

public abstract class Personnage {
    protected String nom;
    protected int energie;
    protected int pouvoir;

    protected Personnage(AbstractPersonnage builder) {
        this.nom = builder.nom;
        this.energie = builder.energie;
        this.pouvoir = builder.pouvoir;
    }
}
