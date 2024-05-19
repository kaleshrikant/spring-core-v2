package org.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);


        Staff staff =  applicationContext.getBean(Doctor.class);
            staff.assist();
        System.out.println("Qualification : "+((Doctor) staff).getQualification());
        System.out.println("Years Of Experience : "+((Doctor) staff).getYearsOfExperience());

        // registering shutdownHook
        applicationContext.registerShutdownHook();

    }
}