package org.example.Email;

public class Main {
    public static void main(String[] args) {
        SmsService emailServicce = new NotificationAdapter();
        emailServicce.sendSms("0606042333", "Hello");

    }
}
