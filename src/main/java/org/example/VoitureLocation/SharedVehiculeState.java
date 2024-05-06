package org.example.VoitureLocation;

public class SharedVehiculeState implements VehiculeFlyweight{
    private String typeVehicule;

    public SharedVehiculeState(String typeVehicule) {
        this.typeVehicule = typeVehicule;
    }

    @Override
    public void afficheVehicule(String model, String couleur, String marque) {
        System.out.println(model);
        System.out.println(couleur);
        System.out.println(marque);
        System.out.println(typeVehicule);
    }
}
