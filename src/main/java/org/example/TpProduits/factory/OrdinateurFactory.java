package org.example.TpProduits.factory;

import org.example.TpProduits.entity.AbstractProduit;
import org.example.TpProduits.entity.Ordinateur;
import org.example.TpProduits.entity.Produit;

public class OrdinateurFactory extends ProduitFactory{

    @Override
    public Ordinateur createProduit(AbstractProduit builder) {
        return (Ordinateur) builder.build();
    }
}
