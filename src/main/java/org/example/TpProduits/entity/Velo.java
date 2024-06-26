package org.example.TpProduits.entity;

public class Velo extends Produit{
    private String typeRoue;

    private Velo(VeloBuilder builder){
        super(builder);
        this.typeRoue = builder.typeRoue;
    }
    @Override
    public String toString() {
        return "Velo{" +
                "nom='" + nom + '\'' +
                ", composant='" + composant + '\'' +
                ", couleur='" + couleur + '\'' +
                ", typeRoue='" + typeRoue + '\'' +
                '}';
    }

    public static class VeloBuilder extends AbstractProduit{
        private String typeRoue;

        public VeloBuilder typeRoue(String typeRoue){
            this.typeRoue = typeRoue;
            return this;
        }

        @Override
        public Velo build() {
            return new Velo(this);
        }
    }
}
