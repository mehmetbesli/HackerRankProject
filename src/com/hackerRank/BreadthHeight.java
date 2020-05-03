package com.hackerRank;

import java.util.Scanner;

/**
 * created by MehmetBesli on 04.2020
 */
public class BreadthHeight {
    static boolean flag = true;
    static int B, H;

    static {
        Scanner scanner = new Scanner(System.in);
        B=scanner.nextInt();
        H=scanner.nextInt();

        if (B < 0 && H < 0) {
            System.out.println("Breadth and height must be positive");
            flag = false;
        } else if ((B <= 0 && H > 0) || (B > 0 && H <= 0)) {
            System.out.println("Breadth and height must be positive");
            flag = false;
        } else {
            flag = true;
        }
    }

    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}