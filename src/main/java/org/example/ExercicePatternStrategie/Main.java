package org.example.ExercicePatternStrategie;

public class Main {
    public static void main(String[] args) {

        System road = System.builder().destination("Lille").build();
        road.navigate(new RoadStrategy());

        System economic = System.builder().destination("Roubaix").build();
        economic.navigate(new EconomicStrategy());




    }
}
