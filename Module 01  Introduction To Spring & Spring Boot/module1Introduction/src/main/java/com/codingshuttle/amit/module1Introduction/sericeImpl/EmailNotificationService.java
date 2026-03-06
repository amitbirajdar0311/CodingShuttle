package com.codingshuttle.amit.module1Introduction.sericeImpl;

import com.codingshuttle.amit.module1Introduction.NotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@ConditionalOnProperty(name="notification.service.type", havingValue = "email")
public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email notification: " + message);
    }
}
