package org.example.Tp3;



public class Abonnement implements Observer {

    @Override
    public void update(Action action) {
        System.out.println("Abonnement"+action.getNom()+action.getPrix());
    }
}
