package com.codingshuttle.amit.module1Introduction.sericeImpl;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("email")
//@ConditionalOnProperty(name="notification.service.type", havingValue = "email")
public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email notification: " + message);
    }
}
