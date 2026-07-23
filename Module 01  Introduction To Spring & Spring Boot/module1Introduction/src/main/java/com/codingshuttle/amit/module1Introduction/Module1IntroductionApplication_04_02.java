package com.codingshuttle.amit.module1Introduction;

import com.codingshuttle.amit.module1Introduction.sericeImpl.NotificationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1IntroductionApplication_04_02 implements CommandLineRunner {

    private final NotificationService notificationService;

    public Module1IntroductionApplication_04_02(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Module1IntroductionApplication_04_02.class, args);

    }
    @Override
    public void run(String... args) throws Exception {
        notificationService.sendNotification("notification.................. ");
    }

}