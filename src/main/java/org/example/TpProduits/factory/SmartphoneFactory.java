package org.example.TpProduits.factory;

import org.example.TpProduits.entity.AbstractProduit;
import org.example.TpProduits.entity.Produit;
import org.example.TpProduits.entity.Smartphone;

public class SmartphoneFactory extends ProduitFactory{
    @Override
    public Smartphone createProduit(AbstractProduit builder) {
        return (Smartphone) builder.build();
    }
}
