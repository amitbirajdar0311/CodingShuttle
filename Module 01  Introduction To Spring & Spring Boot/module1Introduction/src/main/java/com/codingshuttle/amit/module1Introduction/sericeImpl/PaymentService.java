package com.codingshuttle.amit.module1Introduction.sericeImpl;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    public void pay() {
        System.out.println("paying...............");
    }

    @PostConstruct
    public void init() {
        System.out.println("this called after bean initialization and before bean used");
    }

    @PreDestroy
    public void beforeDestory(){
        System.out.println("this called after bean used before destroying object");
    }

}
