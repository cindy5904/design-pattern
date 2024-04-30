package org.example.TpProduits;

import org.example.TpProduits.entity.Ordinateur;

public class Main {
    public static void main(String[] args) {
        Ordinateur.OrdinateurBuilder ordinateur1 = new Ordinateur.OrdinateurBuilder();
        ordinateur1.nom("Ordinateur de bureau")
                .couleur("Noir");

    }
}
