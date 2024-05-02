package org.example.Tp3;

public class Investisseur implements Observer {

    @Override
    public void update(Action action) {
        System.out.println("Investisseur"+action.getPrix()+action.getNom());
    }
}
