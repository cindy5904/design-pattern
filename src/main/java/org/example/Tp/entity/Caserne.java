package org.example.Tp.entity;



public class Caserne extends Batiment{
    private int taille;
    private String style;
    private String nom;

    private Caserne (CaserneBuilder builder) {
        taille = builder.taille;
        style = builder.style;
        nom = builder.nom;
    }

    public static class CaserneBuilder extends AbstractBatiment {
        private int taille;
        private String style;
        private String nom;

        public CaserneBuilder taille(int taille) {
            this.taille = taille;
            return this;
        }

        public CaserneBuilder style(String style) {
            this.style = style;
            return this;
        }
        public CaserneBuilder nom (String nom) {
            this.nom = nom;
            return this;
        }

        public Caserne build() {
            return new Caserne(this);
        }
    }


}
