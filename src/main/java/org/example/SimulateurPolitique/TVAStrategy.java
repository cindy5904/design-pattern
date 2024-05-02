package org.example.SimulateurPolitique;

public class TVAStrategy implements TaskStrategy{

    @Override
    public double calculateTax(double income) {
        double tauxTVA;
        if (income < 10000) {
            tauxTVA = 5;
        } else if (income < 30000) {
            tauxTVA = 10;
        } else {
            tauxTVA = 15;
        }

        double tax = income * (tauxTVA / 100);
        System.out.println("TVA pour un revenu de " + income + " : " + tax);
        return tax;
    }

}
