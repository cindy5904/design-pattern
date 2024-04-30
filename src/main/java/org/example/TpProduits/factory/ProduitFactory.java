package org.example.TpProduits.factory;

import org.example.TpProduits.entity.AbstractProduit;
import org.example.TpProduits.entity.Produit;

public abstract class ProduitFactory {
    public abstract Produit createProduit(AbstractProduit builder);
}
