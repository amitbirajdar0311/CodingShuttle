package com.cts.di;

import com.cts.entity.Address;
import com.cts.entity.Std;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBasedDIConfig {

    @Bean
    public Address address(){
       Address address = new Address();
       address.setPin(411057);
       address.setCity("Pune");
       return address;
    }

    @Bean
    public Std std1(){
        Std std = new Std();
        std.setId(1);
        std.setName("Shyam");
        std.setAddress(address());
        return std;
    }

    @Bean
    public Address address2(){
        Address address = new Address(1234,"Murum");
        return  address;
    }

    @Bean
    public Std std2(){
        return new Std(2,"Shree",address2());
    }
}
