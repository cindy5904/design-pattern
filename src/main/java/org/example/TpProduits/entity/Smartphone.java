package org.example.TpProduits.entity;

public class Smartphone extends Produit{
    private String processeur;
    private int memoire;

    private Smartphone(SmartphoneBuilder builder){
        super(builder);
        this.memoire = builder.memoire;;
        this.processeur = builder.processeur;
    }

    public static class SmartphoneBuilder extends AbstractProduit{
        private String processeur;
        private int memoire;

        public SmartphoneBuilder processeur(String processeur){
            this.processeur = processeur;
            return this;
        }
        public  SmartphoneBuilder memoire(int memoire){
            this.memoire = memoire;
            return this;
        }
        @Override
        public Smartphone build() {
            return new Smartphone(this);
        }
    }
}
