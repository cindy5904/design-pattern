package org.example.TpProduits.entity;

public class Ordinateur extends Produit {
    private String processeur;
    private int memoire;

    private Ordinateur(OrdinateurBuilder builder) {
        super(builder);
        this.processeur = builder.processeur;
        this.memoire = builder.memoire;
    }
    public static class OrdinateurBuilder extends AbstractProduit{
        private String processeur;
        private int memoire;

        public OrdinateurBuilder processeur(String processeur){
            this.processeur = processeur;
            return this;
        }
        public OrdinateurBuilder memoire(int memoire){
            this.memoire = memoire;
            return this;
        }
        @Override
        public String toString() {
            return "OrdinateurBuilder{" +
                    "processeur='" + processeur + '\'' +
                    ", memoire=" + memoire +
                    '}';
        }

         @Override
        public Ordinateur build() {
            return new Ordinateur(this);
         }


    }
}
