package org.example.Email;

public class NotificationAdapter implements SmsService {
    private EmailServicce emailServicce;
    public NotificationAdapter() {
       emailServicce = new EmailServicce();
    }
    @Override
    public void sendSms(String number, String message) {
        emailServicce.sendEmail(number, message);
    }
}
