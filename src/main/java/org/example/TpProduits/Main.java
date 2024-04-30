package org.example.TpProduits;

import org.example.TpProduits.entity.Ordinateur;
import org.example.TpProduits.entity.Smartphone;
import org.example.TpProduits.entity.Velo;
import org.example.TpProduits.factory.OrdinateurFactory;

public class Main {
    public static void main(String[] args) {
        Ordinateur ordinateur = ((Ordinateur.OrdinateurBuilder)new Ordinateur.OrdinateurBuilder().nom("Asus")
                .couleur("Gris")
                .composant("Aluminium")).processeur("I7").memoire(1)
                .build();

        Smartphone smartphone = ((Smartphone.SmartphoneBuilder)new Smartphone.SmartphoneBuilder()
                .nom("Android")
                .couleur("Noir")
                .composant("Plastique"))
                .processeur("intel")
                .memoire(2)
                .build();

        Velo velo = ((Velo.VeloBuilder)new Velo.VeloBuilder()
                .nom("Bike")
                .couleur("Vert")
                .composant("Acier"))
                .typeRoue("Deux roues")
                .build();

        System.out.println(ordinateur.toString());
        System.out.println(smartphone.toString());
        System.out.println(velo.toString());

    }
}
