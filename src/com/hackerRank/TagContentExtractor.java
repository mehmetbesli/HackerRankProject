package com.hackerRank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * created by MehmetBesli on 04.2020
 */
public class TagContentExtractor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();

            String regexTag = "<(.+)>([^<]+)</\\1>";
            Pattern pattern = Pattern.compile(regexTag);
            Matcher matcher = pattern.matcher(line);
            boolean durum = false;
            while (matcher.find()) {
                System.out.println(matcher.group(2));
                durum = true;
            }
            if (!durum) {
                System.out.println("None");
            }


            testCases--;
        }
    }
}