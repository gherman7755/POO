package com.company;

import com.company.things.FullName;
import com.company.things.Gender;

import javax.print.Doc;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        FullName fn = new FullName("Diana Smith Johnson");
        Gender g = new Gender("female");
        Date bd = new Date(20-12-2000);
        Date joined = new Date(02-06-2019);
        String lan[] = {"english", "russian"};
        String loc[] = {"cab.2", "cab.3"};
        String spec[] = {"Pediatric", "Surgery"};
        String ed[] = {"Medical"};
        String cert[] = {"Doctor"};

	    Doctor d = new Doctor("Doc", "Diana", "Smith",
                "Johnson", "Dina", fn,
                bd, g, "Chisinau",
                "+37345641", joined, ed,
                cert, lan, loc, spec);

	    Staff s[] = {d};
	    Department dep = new Department(s);
	    Department deps[] = {dep};

        Hospital h = new Hospital("Mircea cel Batrin", "str.Stefan",
                "+1345463", deps);
    }
}
