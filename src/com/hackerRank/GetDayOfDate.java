package com.hackerRank;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * created by MehmetBesli on 04.2020
 */
public class GetDayOfDate {
    public static void main(String[] args) {
        int day,month,year;
        Scanner scanner = new Scanner(System.in);
        day=scanner.nextInt();
        month=scanner.nextInt();
        year=scanner.nextInt();

        LocalDate localDate=LocalDate.of(year,month,day);
        System.out.println(localDate.getDayOfWeek());
        //System.out.println(localDate.getDayOfWeek().name());





//        int month,  day, year;
//        Date date=new Date();
//        Calendar calendar=Calendar.getInstance(TimeZone.getTimeZone("Europe/Istanbul"));
//        year=calendar.get(Calendar.YEAR);
//        month=calendar.get(Calendar.MONTH);
//        day=calendar.get(Calendar.DAY_OF_MONTH);
//        System.out.println(day);

//        Date date = null;
//        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//        localDate.getYear();
//        localDate.getMonth();
//        int dayOfMonth = localDate.getDayOfMonth();
//        System.out.println(dayOfMonth);
    }
}