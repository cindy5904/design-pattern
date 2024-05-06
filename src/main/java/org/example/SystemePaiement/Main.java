package org.example.SystemePaiement;

public class Main {
    public static void main(String[] args) {
        NewPaymentProcassor newpaiement = new NewPaymentProcassor();
        newpaiement.sendPayment(100);
        newpaiement.authenticate("Lorem");


    }
}
