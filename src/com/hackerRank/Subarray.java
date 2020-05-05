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

        for (int i = 0; i < lengthArr; i++) {
//            String[] splitItem = scanner.nextLine().split(" ");
//            int convertedSplitItem = Integer.parseInt(splitItem[i]);
//            a[i] = convertedSplitItem;
            a[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = 0; i < lengthArr - 1; i++) {
            for (int j = i; j < lengthArr; j++) {
                if (a[i] + a[j] < 0) {
                    System.out.println(a[i] + " + " + a[j] + " : " + (a[i]+a[j]));
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}