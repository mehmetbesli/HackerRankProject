package com.hackerRank;

import java.util.Scanner;

/**
 * created by MehmetBesli on 04.2020
 */
public class StringsIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        String result;
        int lengthStr = A.length() + B.length();
        if(A.compareTo(B)>0){
            result="Yes";
        }else {
            result="No";
        }
        String uppercaseFirstLetter = (A.substring(0, 1).toUpperCase() + A.substring(1)) + " " + (B.substring(0, 1).toUpperCase() + B.substring(1));

        System.out.println(lengthStr);
        System.out.println(result);
        System.out.println(uppercaseFirstLetter);
    }
}