package org.example;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args)  {
        task4dot1();
        task4dot2();
        task4dot3();
    }

    private static void task4dot1(){
        System.out.println("Введите строку");
        String str1 = in.nextLine();
        System.out.println("Введите подстроку");
        String subStr1 = in.nextLine();
        System.out.printf("Подстрока \"%s\" встречается в строке \"%s\" %d раз\n",
                 subStr1, str1, countOccurrences(str1, subStr1));
    }

    private static int countOccurrences(String string, String subString){
        int count = 0;
        int index = string.indexOf(subString);
        int subStringLength = subString.length();

        while (index != -1){
            count++;
            index = string.indexOf(subString, (index + subStringLength));
        }

        return count;
    }

    private static void task4dot2(){
        System.out.println("Введите строку, которую нужно зацензурить");
        String str2 = in.nextLine();
        String censorStr2 = str2.replaceAll("кака|бяка", "'вырезано цензурой'");
        System.out.printf("итоговая строка: %s\n", censorStr2);
    }

    private static void task4dot3(){
        SimpleDateFormat fromThisFormat = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat inThisFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Введите дату в формате dd.MM.yyyy");
        String dateString = in.nextLine();
        Date date = tryParseDate(dateString, fromThisFormat);
        String convertedDateString = inThisFormat.format(date);
        System.out.println("Итоговая дата в формате yyyy-MM-dd: " + convertedDateString);
    }

    private static Date tryParseDate(String dateString, SimpleDateFormat fromThisFormat){
        Date parsingDate = null;
        try{
            parsingDate = fromThisFormat.parse(dateString);
        }catch (Exception e){
            System.out.println("Не удалось преобразовать дату! Проверьте корректность данных!");
        }
        if(Objects.isNull(parsingDate))
            throw new NullPointerException();

        return parsingDate;
    }



}