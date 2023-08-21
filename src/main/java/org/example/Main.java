package org.example;


import org.example.educate.Learner;
import org.example.educate.Student;

import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args)  {
        Learner student = new Student();
        student.learn();
    }

}