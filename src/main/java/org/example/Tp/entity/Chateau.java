package org.example.Tp.entity;

public class Chateau extends Batiment{
    private int taille;
    private String style;
    private String nom;

    private Chateau(chateauBuilder builder) {
        taille = builder.taille;
        style = builder.style;
        nom = builder.nom;
    }

    public static class chateauBuilder extends AbstractBatiment {
        private int taille;
        private String style;
        private String nom;

        public chateauBuilder taille(int taille) {
            this.taille = taille;
            return this;
        }

        public chateauBuilder style(String style) {
            this.style = style;
            return this;
        }
        public chateauBuilder nom (String nom) {
            this.nom = nom;
            return this;
        }

        public Chateau build() {
            return new Chateau(this);
        }
    }
}


