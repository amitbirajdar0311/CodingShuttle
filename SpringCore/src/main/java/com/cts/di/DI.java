package com.cts.di;

import com.cts.entity.Address;
import com.cts.entity.Std;
import com.cts.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DI {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("DI.xml");
//        Std std = context.getBean("std1", Std.class);
//        System.out.println(std);
//        Address address = context.getBean("address1", Address.class);
//        System.out.println(address);

        Std std = context.getBean("std2", Std.class);
        System.out.println(std);
    }
}
