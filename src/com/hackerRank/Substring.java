package com.hackerRank;

import java.util.Scanner;

/**
 * created by MehmetBesli on 04.2020
 */
public class Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        S= S.substring(start,end);
        System.out.println(S);
    }
}