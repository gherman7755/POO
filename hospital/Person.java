package com.company;
import com.company.things.FullName;
import com.company.things.Gender;

import java.util.Date;

public class Person {
    String title;
    String giveName;
    String middleName;
    String familyName;
    String name;
    FullName fullName;
    Date birthDate;
    Gender gender;
    String homeAddress;
    String phone;

    public Person(FullName n, Gender g, Date birthDate){
        this.fullName = n;
        this.gender = g;
        this.birthDate = birthDate;
    }

    public Person(String title, String giveName, String middleName,
                  String familyName, String name, FullName fullname,
                  Date birthDate, Gender gender, String homeAddress,
                  String phone){
        this.title = title;
        this.birthDate = birthDate;
        this.familyName = familyName;
        this.fullName = fullname;
        this.gender = gender;
        this.giveName = giveName;
        this.birthDate = birthDate;
        this.homeAddress = homeAddress;
        this.middleName = middleName;
        this.name = name;
        this.phone = phone;

    }
}
