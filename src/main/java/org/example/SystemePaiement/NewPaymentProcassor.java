package org.example.SystemePaiement;

public class NewPaymentProcassor {
    public void authenticate(String apiKey){
        System.out.println("Utilisateur"+apiKey);
    };
    public void sendPayment(double amount) {
        System.out.println("votre solde est de "+amount);
    }

}
