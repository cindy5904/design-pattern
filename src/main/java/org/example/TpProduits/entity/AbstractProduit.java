package org.example.TpProduits.entity;

public abstract class AbstractProduit {
    protected String nom;
    protected String composant;
    protected String couleur;

    public AbstractProduit nom(String nom) {
        this.nom = nom;
        return this;
    }
    public  AbstractProduit composant(String composant){
        this.composant = composant;
        return this;
    }

    public AbstractProduit couleur(String couleur){
        this.couleur = couleur;
        return this;
    }
    public abstract Produit build();


}
