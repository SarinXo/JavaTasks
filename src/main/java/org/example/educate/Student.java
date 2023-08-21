package org.example.educate;

import java.util.Date;

public class Student extends Learner{

    @Override
    public void learn() {
        System.out.println(new Date());
    }
}
