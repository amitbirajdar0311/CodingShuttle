package com.codingshuttle.amit.module1Introduction;

import com.codingshuttle.amit.module1Introduction.sericeImpl.EmailNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {

//    @Autowired
//    --> This is field injection, not recommended \
//    @Qualifier("smsNotificationService")
//    NotificationService notificationService;


//    final NotificationService notificationService;
//    Constructor Injection is the recommended way to inject dependencies in Spring. It allows for better testability and immutability of the class.
//    public Module1IntroductionApplication(NotificationService notificationService) {
//        this.notificationService = notificationService; // This will inject the EmailNotificationService because it is marked as @Primary
//    }


    @Autowired
    private Map<String, NotificationService> notificationServiceMap;
    public static void main(String[] args) {
        SpringApplication.run(Module1IntroductionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        notificationService.sendNotification("Hello, this is a notification!");

        for(var notificationService: notificationServiceMap.entrySet()){
            System.out.println("Bean name: " + notificationService.getKey());
            notificationService.getValue().sendNotification("Hello, this is a notification!");
        }
    }
}
