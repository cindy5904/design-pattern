package org.example.VoitureLocation;

public class Vehicule {
    private String model;
    private String couleur;
    private String marque;

    private VehiculeFlyweight flyweight;

    public Vehicule(String model, String couleur, String marque, VehiculeFlyweight flyweight) {
        this.model= model;
        this.couleur = couleur;
        this.marque = marque;
        this.flyweight = flyweight;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
    public void display() {
        this.flyweight.afficheVehicule(model, couleur, marque);
    }
}
