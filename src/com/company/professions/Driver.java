package com.company.professions;

import com.company.Person;

public class Driver extends Person {
    private int experiance;

    public Driver(String fullName, int experience) {
        super(fullName, 0);
        this.experiance = experience;
    }

    public int getExperiance() {
        return experiance;
    }

    public void setExperiance(int experiance) {
        this.experiance = experiance;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experiance=" + experiance +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

}
