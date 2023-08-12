package org.example;


import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args)  {
        int[] randValues = new int[20];

        // диапазон [1; 15] - включительно
        randValues = Arrays.stream(randValues)
                .map(num ->(1 + (int)(Math.random() * 15) ))
                .toArray();

        Arrays.stream(randValues)
                .forEach(System.out::println);

        Map<Integer, Long> map = Arrays.stream(randValues)
                .boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        map.entrySet().stream()
                .filter(cell -> cell.getValue() > 1)
                .forEach(cell -> System.out.printf("число '%d' встречается %d раза\n", cell.getKey(), cell.getValue()));
    }

}