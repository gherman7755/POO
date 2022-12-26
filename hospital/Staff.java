package com.company;

import com.company.things.FullName;
import com.company.things.Gender;

import java.util.Date;

public class Staff extends Person{
    Date joined;
    String[] education;
    String[] certification;
    String[] languages;

    public Staff(String title, String giveName, String middleName, String familyName,
                 String name, FullName fullname, Date birthDate, Gender gender,
                 String homeAddress, String phone, Date joined, String[] education,
                 String[] certification, String[] languages) {

        super(title, giveName, middleName, familyName, name,
                fullname, birthDate, gender, homeAddress, phone);
        this.joined = joined;
        this.certification = certification;
        this.education = education;
        this.languages = languages;
    }
}
