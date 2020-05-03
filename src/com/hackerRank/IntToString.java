package com.hackerRank;

import java.util.Random;
import java.util.Scanner;

/**
 * created by MehmetBesli on 04.2020
 */
public class IntToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 100;
        int min = -100;
        Random rnd = new Random();
        int generatedNumber = rnd.nextInt((max - min) + 1) + min;
        String convertedStr=String.valueOf(generatedNumber);
        System.out.println(convertedStr);
    }
}