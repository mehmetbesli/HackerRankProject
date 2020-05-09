package com.hackerRank;

        import java.util.Scanner;

/**
 * created by MehmetBesli on 05.2020
 */
public class Subarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthArr = scanner.nextInt();
        int[] a = new int[lengthArr];

        int count = 0;
        for (int i = 0; i < lengthArr; i++) {
            a[i] = scanner.nextInt();
            if(a[i]<0){
                count++;
            }
        }

        for (int i = 0; i < lengthArr; i++) {

        }


        System.out.println(count);
    }
}