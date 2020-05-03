package com.hackerRank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * created by MehmetBesli on 04.2020
 */
public class IsAnagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function

        Boolean value = false;
        if(a!=null && b!=null){
            char[] strA=a.toLowerCase().toCharArray();
            char[] strB=b.toLowerCase().toCharArray();
            Arrays.sort(strA);
            Arrays.sort(strB);
            value=Arrays.equals(strA,strB);
        }
        return value;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
