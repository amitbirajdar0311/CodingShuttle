package com.codingshuttle.amit.module1Introduction.sericeImpl;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("sms")
//@Primary
//@ConditionalOnProperty(name = "notification.service.type", havingValue = "sms")
public class SmsNotificationService implements NotificationService {

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}
