package org.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages = "org.demo")
public class BeanConfiguration {
/*    @Bean
    public Doctor doctor() {
        return new Doctor("MBBS", 10);
    }*/
}
