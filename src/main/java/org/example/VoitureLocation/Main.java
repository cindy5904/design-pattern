package org.example.VoitureLocation;

public class Main {
    public static void main(String[] args) {
        VehiculeFactory factory = new VehiculeFactory();
        Vehicule vehicule = new Vehicule("3008", "Noir", "Peugeot", factory.getVehicule
                ("Electrique", "3008", "Noir", "Peugeot"));
        vehicule.display();
    }

}
