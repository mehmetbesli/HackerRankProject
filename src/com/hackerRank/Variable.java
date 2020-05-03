package com.hackerRank;

import java.util.Scanner;

/**
 * created by MehmetBesli on 04.2020
 */
public class Variable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int intNumber = scan.nextInt();
        double doubleNumber=scan.nextDouble();
        scan.nextLine();
        String strLine=scan.nextLine();

        System.out.println("String: " + strLine);
        System.out.println("Double: " + doubleNumber);
        System.out.println("Int: " + intNumber);
    }
}