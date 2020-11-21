package com.company;
import com.company.things.FullName;
import com.company.things.Gender;
import com.company.things.History;

import java.util.Date;

public class Patient extends Person{
    String id;
    Integer age;
    Date accepted;
    History sickness;
    String [] prescriptions;
    String [] allergies;
    String [] specialReqs;

    Patient(String id, FullName n, Gender g, Date bD, Integer age,
            Date ac, History sick, String[] prescript,
            String [] allerg, String[] specReq){
        super(n, g, bD);
        this.id = id;
        this.age = age;
        this.accepted = ac;
        this.sickness = sick;
        this.prescriptions = prescript;
        this.allergies = allerg;
        this.specialReqs = specReq;
    }
}
