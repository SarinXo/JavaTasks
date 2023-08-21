package org.example;

import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args)  {
        System.out.println("Введите 2 числа");
        long a = in.nextLong();
        long b = in.nextLong();
        System.out.println(LongStream.range(a, b).sum());
    }

}