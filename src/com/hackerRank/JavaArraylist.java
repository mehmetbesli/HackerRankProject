package com.hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * created by MehmetBesli on 05.2020
 */
public class JavaArraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        List<String[]> arrLists = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            int number2=scanner.nextInt();
            for (int j = 0; j < number2; j++) {
                String lines = scanner.next();
                String[] lineArr = lines.split(" ");
                arrLists.add(lineArr);
            }

        }

        int totalNumber = scanner.nextInt();
        for (int i = 0; i < totalNumber; i++) {
            String[] xyArr = scanner.next().split(" ");
            int x = Integer.parseInt(xyArr[0]);
            int y = Integer.parseInt(xyArr[1]);

            if (arrLists.size() > x && arrLists.get(x - 1).length > y) {
                System.out.println(arrLists.get(x - 1)[y - 1]);
            } else {
                System.out.println("ERROR");
            }
        }

    }
}

/*
        List<String[]> arrLists = new ArrayList<>(n);
        for (int i = 0; i < number; i++) {
            int number2=scanner.nextInt();
            for (int j = 0; j < number2; j++) {
                String lineStr= String.valueOf(number2);
                String[] lineArr = lineStr.split(" ");
                arrLists.add(lineArr);
            }
        }
* */