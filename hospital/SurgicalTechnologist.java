package com.company;

import com.company.things.FullName;
import com.company.things.Gender;

import java.util.Date;

public class SurgicalTechnologist extends Technologist {
    public SurgicalTechnologist(String title, String giveName,
                                String middleName, String familyName,
                                String name, FullName fullname, Date birthDate,
                                Gender gender, String homeAddress, String phone,
                                Date joined, String[] education, String[] certification,
                                String[] languages) {

        super(title, giveName, middleName, familyName, name, fullname,
                birthDate, gender, homeAddress, phone, joined, education,
                certification, languages);
    }
}
