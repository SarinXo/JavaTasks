package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DateManipulatorTest {
    private List<Date> dates = new ArrayList<>();

    private DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");



    @BeforeAll
    public void init() throws ParseException {
        dates.add(dateFormat.parse("01.08.2023"));
        dates.add(dateFormat.parse("02.08.2023"));
        dates.add(dateFormat.parse("03.08.2023"));
        dates.add(dateFormat.parse("04.08.2023"));
        dates.add(dateFormat.parse("05.08.2023"));
        dates.add(dateFormat.parse("06.08.2023"));
        dates.add(dateFormat.parse("07.08.2023"));
        dates.add(dateFormat.parse("08.08.2023"));
        dates.add(dateFormat.parse("09.08.2023"));
        dates.add(dateFormat.parse("10.08.2023"));
        dates.add(dateFormat.parse("11.08.2023"));
        dates.add(dateFormat.parse("12.08.2023"));
        dates.add(dateFormat.parse("13.08.2023"));
        dates.add(dateFormat.parse("14.08.2023"));
        dates.add(dateFormat.parse("15.08.2023"));
        dates.add(dateFormat.parse("16.08.2023"));
        dates.add(dateFormat.parse("17.08.2023"));
        dates.add(dateFormat.parse("18.08.2023"));
        dates.add(dateFormat.parse("19.08.2023"));
        dates.add(dateFormat.parse("20.08.2023"));
        dates.add(dateFormat.parse("21.08.2023"));
        dates.add(dateFormat.parse("22.08.2023"));
        dates.add(dateFormat.parse("23.08.2023"));
        dates.add(dateFormat.parse("24.08.2023"));
        dates.add(dateFormat.parse("25.08.2023"));
        dates.add(dateFormat.parse("26.08.2023"));
        dates.add(dateFormat.parse("27.08.2023"));
    }

    @Test
    public void testIncreaseDateOfWorkingDays(int workDays) throws ParseException {
        Date actualDate = dateFormat.parse("14.08.2023");
        DateManipulator dateManipulator = null;

        for (var date:
             dates) {

        }
    }
}