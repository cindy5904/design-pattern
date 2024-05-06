package org.example.SystemePaiement;

public class PaymentAdapter implements OldPaymentGateway{
    private NewPaymentProcassor newPaymentProcassor;



    public PaymentAdapter() {
        this.newPaymentProcassor = new NewPaymentProcassor() ;
    }

    @Override
    public void makePayment(String accountNumber, double amount) {
        newPaymentProcassor.authenticate("Lorem");
    }
}
