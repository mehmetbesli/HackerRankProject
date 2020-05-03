package com.hackerRank;

import java.util.Scanner;

/**
 * created by MehmetBesli on 04.2020
 */
public class FormulSolution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = 0;
            for (int k = 0; k <= n - 1; k++) {
                result = (int) Math.pow(2, k) * b + result;
                System.out.print(a + result + " ");
            }
            System.out.println();
        }

    }
}