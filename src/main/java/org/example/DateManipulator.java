package org.example;

import java.util.Calendar;
import java.util.Date;

public class DateManipulator {

    private final Calendar calendar = Calendar.getInstance();

    private Date date;

    public DateManipulator(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
        calendar.setTime(date);
    }

    public Date increaseDate(int days) {
        setNormalDate();
        calendar.add(Calendar.DAY_OF_MONTH, days);
        return calendar.getTime();
    }

    private void setNormalDate() {
        calendar.setTime(date);
    }

    public Date getDateAtBeginningYear() {
        setNormalDate();
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        return calendar.getTime();
    }

    public Date increaseDateOfWorkingDays(int workDays) {
        setNormalDate();
        int normalDays = 0;
        // Если рабочих дней больше 6, то мы 100% захватываем еще 2 нерабочих. Если дальше мы
        // будем брать по 5 дней, то будем захватывать еще по 2 нерабочих дня избавляясь от
        // бОльшей части дней мы ускоряем алгоритм, а остальные дни мы обычным циклом прогоняем
        if (workDays > 5) {
            workDays -= 6;
            normalDays += 8;
            normalDays += (workDays / 5) * 7;
            workDays %= 5;
            calendar.add(Calendar.DAY_OF_MONTH, normalDays);
        }

        while (workDays != 0) {

            if (isWorkDay()) {
                workDays--;
            }
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }

        return calendar.getTime();
    }

    private boolean isWorkDay() {
        return calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY &&
                calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY;
    }

    public long countWorkDaysBetweenDates(Date date2) {
        setNormalDate();
        long milliseconds = Math.abs(date.getTime() - date2.getTime());
        //округление с недостатком, но задание предполагает даты без времени
        long days = milliseconds / (24 * 60 * 60 * 1000);
        return countWorkingDays(days);
    }

    private long countWorkingDays(long days) {
        long totalWeeks = days / 7;
        long remainingDays = days % 7;

        long workingDays = totalWeeks * 5;
        if (remainingDays > 0) {
            calendar.add(Calendar.DAY_OF_MONTH,(int)totalWeeks * 7);

            while (remainingDays != 0) {
                if (isWorkDay()) {
                    workingDays++;
                }
                calendar.add(Calendar.DAY_OF_MONTH, 1);
                remainingDays--;
            }
        }

        return workingDays;
    }

}
