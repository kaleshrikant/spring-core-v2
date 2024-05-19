package org.demo;

public class Doctor implements Staff{

    private String qualification;
    private Integer yearsOfExperience;

    public Doctor() {
    }
/*
    private Nurse nurse;

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }
*/

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

}
