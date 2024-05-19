package org.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);


        Staff staff =  applicationContext.getBean(Doctor.class);
            staff.assist();
        System.out.println("Qualification : "+((Doctor) staff).getQualification());
        System.out.println("Years Of Experience : "+((Doctor) staff).getYearsOfExperience());

    }
}