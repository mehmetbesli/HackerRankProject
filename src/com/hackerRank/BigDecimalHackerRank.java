package com.hackerRank;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * created by MehmetBesli on 05.2020
 */
public class BigDecimalHackerRank {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1==null || o2==null) {
                    return 0;
                }

                BigDecimal bd1=new BigDecimal(o1);
                BigDecimal bd2=new BigDecimal(o2);
                return bd2.compareTo(bd1);
            }
        });


        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}