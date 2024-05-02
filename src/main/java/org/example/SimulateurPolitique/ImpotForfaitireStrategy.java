package org.example.SimulateurPolitique;

public class ImpotForfaitireStrategy implements TaskStrategy{
    @Override
    public double calculateTax(double income) {
        double tax = 0;
        if (income <= 10000) {
            tax = 0.1 * income;
        } else if (income <= 30000){
            tax = 0.2 * (income - 10000) + 1000;
        } else {
            tax = 0.3 * (income - 30000) + 5000;
        }
        System.out.println("Impot progressif pour un revenu de " + income + " : " + tax);
        return tax;
    }
}
