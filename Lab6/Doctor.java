package com.company;

import com.company.things.FullName;
import com.company.things.Gender;

import java.util.Date;

public class Doctor extends OperationsStaff{
    String[] speciality;
    String[] locations;
    public Doctor(String title, String giveName, String middleName, String familyName,
                  String name, FullName fullname, Date birthDate, Gender gender,
                  String homeAddress, String phone, Date joined, String[] education,
                  String[] certification, String[] languages, String[] locations,
                  String[] speciality) {
        super(title, giveName, middleName, familyName, name, fullname,
                birthDate, gender, homeAddress, phone, joined, education,
                certification, languages);
        this.locations = locations;
        this.speciality = speciality;
    }
}
