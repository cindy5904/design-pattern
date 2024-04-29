package org.example.Exercice1;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza.PizzaBuilder().taille("moyenne").pate("fine").fromage("Mozzarella").garniture("Poivron, Oignon, Viande Haché").sauce("Tomate").build();
        System.out.println(pizza1);
    }

}
