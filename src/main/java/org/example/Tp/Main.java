package org.example.Tp;

import org.example.Tp.entity.Chateau;

public class Main {
    public static void main(String[] args) {
        Chateau chateau = new Chateau.chateauBuilder().build();
        System.out.println(chateau);
    }
}
