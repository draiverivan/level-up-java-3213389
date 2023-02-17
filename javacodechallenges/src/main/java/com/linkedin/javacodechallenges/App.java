package com.linkedin.javacodechallenges;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class App 
{
    // Create function to calculate the date that's 
    // 100 days from now
    public static Date calculateHundredDaysFromNow() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 100);
        return c.getTime();
    }
    
    public static LocalDate calculateHundredDaysFromNow(LocalDate today) {
        Period hundredDays = Period.ofDays(100);
        return today.plus(hundredDays);
    }

    public static void main( String[] args )
    {
        LocalDate today = LocalDate.now(ZoneId.of("America/New_York"));
        System.out.println("100 days from now is... " +
                calculateHundredDaysFromNow(today));
        System.out.println("100 days from now is... "+  calculateHundredDaysFromNow()
            /* add function call */);
    }
}
