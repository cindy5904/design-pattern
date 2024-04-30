package org.example.Tp.entity;

public class Guerrier extends Personnage{
    private int armure;

    private Guerrier(GuerrierBuilder guerrierBuilder) {
        super(guerrierBuilder);
        this.armure = guerrierBuilder.armure;
    }

    public static class GuerrierBuilder extends AbstractPersonnage {
        private int armure;

        public GuerrierBuilder armure(int armure) {
            this.armure = armure;
            return this;
        }

        @Override
        public Personnage build() {
            return new Personnage(this) {
            };
        }
    }
}
