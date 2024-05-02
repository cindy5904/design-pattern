package org.example.ExercicePatternStrategie;

import java.util.Random;

public class RoadStrategy implements NavigationStrategie{
    private Random random = new Random();
    @Override
    public boolean navigate(String destination) {
//        System.out.println("Destination"+ destination);
        return random.nextBoolean();
    }
}
