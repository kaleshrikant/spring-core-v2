package org.demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class Doctor implements Staff, BeanNameAware {

    private String qualification;
    private Integer yearsOfExperience;

    public Doctor() {
    }

    public Doctor(String qualification, Integer yearsOfExperience) {
        this.qualification = qualification;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void assist() {
        System.out.println("Doctor is assisting.");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName()method is called.");
    }

    @PostConstruct
    public void init() {
        System.out.println("@PostConstruct");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("@PreDestroy");
    }
}
