package com.hackerRank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * created by MehmetBesli on 04.2020
 */
public class CurrencyFormatter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat china=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france=NumberFormat.getCurrencyInstance(Locale.FRANCE);

        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat india=NumberFormat.getCurrencyInstance(indiaLocale);

        Locale turkeyLocale = new Locale("tr", "Tr");
        NumberFormat turkey=NumberFormat.getCurrencyInstance(turkeyLocale);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
        System.out.println("Turkey: " + turkey.format(payment));

    }
}