package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Monitor mon1 = new Monitor();
        mon1.color = "Red";
        mon1.resolution = 15.5f;
        mon1.dimensions = "1366x780";
        mon1.dimensions = "1366x780";

        Monitor mon2 = new Monitor();
        mon2.color = "Blue";
        mon2.resolution = 17.0f;
        mon2.dimensions = "1920x1080";

        if (mon1.color == mon2.color && mon1.resolution == mon2.resolution && mon1.dimensions == mon2.dimensions){
            System.out.println("They are the same");
        }
        else {
            System.out.println("Something is different");
        }

        Student std1 = new Student();
        std1.name = "Nagiev";
        std1.age = 20;
        std1.mark = 6.3f;

        Student std2 = new Student();
        std2.name = "Malysheva";
        std2.age = 55;
        std2.mark = 9.9f;


        Student std3 = new Student();
        std3.name = "Stefan";
        std3.age = 78;
        std3.mark = 5.5f;

        Univesity un1 = new Univesity();
        un1.found_year = 1982;
        un1.name = "UTM";
        un1.students.add(std1);

        Univesity un2 = new Univesity();
        un2.name = "USM";
        un2.found_year = 2000;
        un2.students.add(std2);

        Univesity un3 = new Univesity();
        un3.name = "ULIM";
        un3.found_year = 2001;
        un3.students.add(std3);

        ArrayList<Student> all = new ArrayList<Student>();
        all.addAll(un1.students);
        all.addAll(un2.students);
        all.addAll(un3.students);

        float sum = 0;
        for (Student std : all){
            sum += std.mark;
        }
        System.out.println("Media = " + sum / all.size());
        }
    }
