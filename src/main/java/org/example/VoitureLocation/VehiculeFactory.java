package org.example.VoitureLocation;

import java.util.HashMap;
import java.util.Map;

public class VehiculeFactory {
    private static Map<String, SharedVehiculeState> vehicules = new HashMap<>();

    public SharedVehiculeState getVehicule( String typeVehicule, String model, String couleur, String marque) {
        String key = model + "|" + couleur + "|" + marque;
        if(!vehicules.containsKey(key)) {
            vehicules.put(key, new SharedVehiculeState(typeVehicule));
        }
        return vehicules.get(key);
    }
}
