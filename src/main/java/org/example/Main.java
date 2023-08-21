package org.example;

import org.example.calculator.Calculator;

import java.util.Scanner;

public class Main {

    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args)  {
        Calculator multiply = new Calculator((op1, op2)-> op1*op2);
        Calculator divide = new Calculator((op1, op2)-> op1/op2);
        System.out.println("Введите 2 числа для умножения");
        calcOperation(multiply);
        System.out.println("Введите 2 числа для деления");
        calcOperation(divide);
    }

    public static void calcOperation(Calculator calc){
        assert calc != null;
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.printf("результат: %f\n", calc.doOperation(a, b));
    }

}