package org.example;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private final static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String dateString = in.nextLine();
        Date date = dateFormat.parse(dateString);

        DateManipulator dateManipulator = new DateManipulator(date);

        String date45 = dateFormat.format(dateManipulator.increaseDate(45));
        System.out.println("Дата увеличенная на 45 дней: "+ date45);

        String beginningOfYear = dateFormat.format(dateManipulator.getDateAtBeginningYear());
        System.out.printf("Дата начала этого года: %s\n", beginningOfYear);

        String increaseTenDays = dateFormat.format(dateManipulator.increaseDateOfWorkingDays(10));
        System.out.printf("Дата увеличенная на %d рабочих дней: \n"+ increaseTenDays, 10);

        String dateString2 = in.nextLine();
        Date date2 = dateFormat.parse(dateString2);
        long days = dateManipulator.countWorkDaysBetweenDates(date2);
        System.out.println("Между этими днями : "+ days + " рабочих дней");

    }

}