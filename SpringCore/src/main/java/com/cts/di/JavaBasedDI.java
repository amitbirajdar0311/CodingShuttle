package com.cts.di;

import com.cts.entity.Std;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedDI{
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaBasedDIConfig.class);
        Std std = context.getBean("std1", Std.class);
        System.out.println(std);

        Std std2 = context.getBean("std2", Std.class);
        System.out.println(std2);
    }
}
