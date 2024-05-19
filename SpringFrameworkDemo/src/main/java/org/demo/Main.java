package org.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        Doctor doc = applicationContext.getBean(Doctor.class);
        doc.assist();

        Nurse nurse = (Nurse) applicationContext.getBean("nur");
        nurse.assist();

    }
}