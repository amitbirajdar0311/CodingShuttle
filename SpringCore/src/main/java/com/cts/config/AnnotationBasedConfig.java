package com.cts.config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan(basePackages = "com.cts.entity")
@PropertySource("classpath:application.properties")
public class AnnotationBasedConfig {
    
    // Bean required for property placeholder resolution in Java config
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
