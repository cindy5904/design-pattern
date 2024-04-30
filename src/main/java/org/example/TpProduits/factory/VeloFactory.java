package org.example.TpProduits.factory;

import org.example.TpProduits.entity.AbstractProduit;
import org.example.TpProduits.entity.Produit;
import org.example.TpProduits.entity.Velo;

public class VeloFactory extends ProduitFactory {

    @Override
    public Velo createProduit(AbstractProduit builder) {
        return (Velo) builder.build();
    }
}
