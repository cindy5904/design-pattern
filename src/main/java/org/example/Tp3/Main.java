package org.example.Tp3;

public class Main {
    public static void main(String[] args) {
        Action action = Action.builder().nom("Lorem").prix(500).build();
        System.out.println(action);
    }
}
