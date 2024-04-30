package org.example.TpProduits.entity;

public abstract class Produit {
    protected String nom;
    protected String composant;
    protected String couleur;

    protected Produit(AbstractProduit builder) {
        this.nom = builder.nom;
        this.composant = builder.composant;
        this.couleur = builder.couleur;
    }
}
