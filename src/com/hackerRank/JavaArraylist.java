package com.hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * created by MehmetBesli on 05.2020
 */
public class JavaArraylist {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();

        List<String[]> arrLists=new ArrayList<>();
        for(int i=0; i<number; i++){
            String[] lineArr = scanner.next().split(" ");
            arrLists.add(lineArr);
        }

        int totalNumber=scanner.nextInt();
        for (int i = 0; i <totalNumber; i++) {
            String[] xyArr=scanner.next().split(" ");

        }

    }
}
