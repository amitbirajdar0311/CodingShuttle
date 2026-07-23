//package com.codingshuttle.amit.module1Introduction;
//
//import com.codingshuttle.amit.module1Introduction.sericeImpl.PaymentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class Module1IntroductionApplication_03_02 implements CommandLineRunner {
//
//    //Autowired PaymentService to use its pay method
//    @Autowired
//    PaymentService paymentService;
//
//    public static void main(String[] args) {
//        SpringApplication.run(Module1IntroductionApplication_03_02.class, args);
//
//    }
//    @Override
//    public void run(String... args) throws Exception {
//        paymentService.pay();
//    }
//
//}