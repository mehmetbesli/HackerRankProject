package com.hackerRank;

import java.util.Scanner;

/**
 * created by MehmetBesli on 04.2020
 */
public class EndOfFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        int i = 1;
//        while (scanner.hasNext()) {
//            String str = scanner.nextLine();
//            if (str == null || str.length() == 0 || str.isEmpty())
//                break;
//            System.out.println(i+" "+str);
//            i++;
//        }

        for (int a = 1; scanner.hasNextLine() == true; a++) {
            String sentence = scanner.nextLine();
            if (sentence == null || sentence.length() == 0 || sentence.isEmpty())
                break;
            System.out.println(a+" "+sentence);
        }

    }
}