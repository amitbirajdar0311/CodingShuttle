package com.codingshuttle.amit.module1Introduction;


import com.codingshuttle.amit.module1Introduction.sericeImpl.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class Module1IntroductionApplication_04_03 implements CommandLineRunner {

    @Autowired
    private Map<String,NotificationService> notificationServiceMap;

    public static void main(String[] args) {
        SpringApplication.run(Module1IntroductionApplication_04_03.class, args);

    }
    @Override
    public void run(String... args) throws Exception {
        for(var notificationService: notificationServiceMap.entrySet()){
            System.out.println("Bean name: " + notificationService.getKey());
            notificationService.getValue().sendNotification("Hello, this is a notification!");
        }
    }

}
