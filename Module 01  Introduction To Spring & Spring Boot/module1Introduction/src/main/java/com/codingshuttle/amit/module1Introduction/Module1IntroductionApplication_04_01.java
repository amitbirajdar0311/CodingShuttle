//package com.codingshuttle.amit.module1Introduction;
//
//import com.codingshuttle.amit.module1Introduction.sericeImpl.NotificationService;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class Module1IntroductionApplication_04_01 implements CommandLineRunner {
//
//    //This is feild injection don't use in
////    @Autowired
////    NotificationService notificationService;
//
//    //This is constructor injection and this is the best way to inject dependency in spring boot
//    private final NotificationService notificationService;
//
//    public Module1IntroductionApplication_04_01(@Qualifier("email") NotificationService notificationService) {
//        this.notificationService = notificationService;
//    }
//
//    public static void main(String[] args) {
//        SpringApplication.run(Module1IntroductionApplication_04_01.class, args);
//
//    }
//    @Override
//    public void run(String... args) throws Exception {
//        notificationService.sendNotification("notification.................. ");
//    }
//
//}