package com.hackerRank;

import java.util.Scanner;

/**
 * created by MehmetBesli on 04.2020
 */
public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentenceStr = scan.nextLine();
        String[] splittedStrArr = new String[0];
        if (sentenceStr.trim().length() != 0) {
            splittedStrArr = sentenceStr.trim().split("[ !,?._'@]+");
        }
        System.out.println(splittedStrArr.length);
        if (splittedStrArr.length > 0) {
            for (String item : splittedStrArr) {
                System.out.println(item);
            }
        }
        scan.close();

    }
}