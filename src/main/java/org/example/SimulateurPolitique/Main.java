package org.example.SimulateurPolitique;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez une stratégie fiscale pour la simulation :");
        System.out.println("1. Impôt Progressif sur le revenu");
        System.out.println("2. TVA");
        System.out.println("3. Impôt Forfaitaire");
        System.out.println();
        System.out.print("Votre choix : ");

        int choix = scanner.nextInt();
        scanner.nextLine();

        Simulator simulator = Simulator.builder().build();

        switch (choix) {
            case 1 :
                System.out.print("Entrez votre revenu : ");
                double revenu = scanner.nextDouble();
                simulator.calculatax(new ImpotProgressifStrategy(), revenu);
                break;

            case 2 :
                System.out.print("Entrez votre revenu : ");
                double revenu2 = scanner.nextDouble();
                simulator.calculatax(new TVAStrategy(), revenu2);
                break;

            case 3 :
                System.out.println("Entrez votre revenu Forfétaire: ");
                double revenu1 = scanner.nextDouble();
                simulator.calculatax(new ImpotForfaitireStrategy(), revenu1);
                break;

            default :
                System.out.println("Choix invalide !");
        }
    }
}
