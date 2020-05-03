package com.hackerRank;

import java.util.Scanner;

/**
 * created by MehmetBesli on 04.2020
 */
public class SubstringComparisons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String subStr;
        smallest=s.substring(0,k);
        largest=s.substring(0,k);

        for (int i = 0; i < s.length() - k + 1; i++) {
            subStr = s.substring(i, i + k);
            if (smallest.compareTo(subStr)>0){
                smallest=subStr;
            }
            if(largest.compareTo(subStr)<0){
                largest=subStr;
            }
        }

        return smallest + "\n" + largest;
    }
}