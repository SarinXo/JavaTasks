package org.example;


import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);

        out.println("Введите a, b, c");
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        {
            int divider = 5;

            boolean aBy5 = printIfDivisibleBy('a', a, divider);
            boolean bBy5 = printIfDivisibleBy('b', b, divider);
            boolean cBy5 = printIfDivisibleBy('c', c, divider);

            if (!aBy5 && !bBy5 && !cBy5) {
                out.println("нет значений, кратных 5");
            }
        }

        out.printf("Значение от целочисленного деления a на b (результат - целое число) a/b=%d\n", a/b);

        out.printf("Значение от деления a на b (результат - число с плавающей запятой) a/b=%f\n", (double)a/b);

        out.printf("Значение от деления a на b (результат - число с плавающей запятой), " +
                "округленного до ближайшего целого в БОЛЬШУЮ сторону a/b=%d\n", (long)Math.ceil((double)a/b));

        out.printf("Значение от деления a на b (результат - число с плавающей запятой), " +
                "округленного до ближайшего целого в МЕНЬШУЮ сторону a/b=%d\n", (long)Math.floor((double)a/b));

        out.printf("Значение от деления a на b (результат - число с плавающей запятой), " +
                "округленного до ближайшего целого в МАТ округлением a/b=%d\n", Math.round((double)a/b));

        out.printf("Остаток от деления b на c b%%c=%d\n", b%c);

        out.printf("Наименьшее значение из a и b =%d\n", Math.min(a, b));

        out.printf("Наибольшее значение из b и c =%d\n", Math.max(b, c));
    }

    private static boolean printIfDivisibleBy(char letter, int divisible, int divider){
        if(divisible % divider == 0){
            out.printf(letter + "=%d\n", divisible);
            return true;
        }
        return false;
    }
}