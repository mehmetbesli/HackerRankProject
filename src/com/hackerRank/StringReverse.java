package com.hackerRank;

import java.util.Scanner;

/**
 * created by MehmetBesli on 04.2020
 */
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        String reversedStr = "";
        for(int i=A.length()-1; i>=0; i--){
            reversedStr +=A.charAt(i);
        }
        if(A.equals(reversedStr)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }


//        StringBuilder builder=new StringBuilder();
//        for(int i=A.length()-1; i>=0; i--){
//            builder =builder.append(A.charAt(i));
//        }
//        if(A.equals(builder.toString())){
//            System.out.println("Yes");
//        }else {
//            System.out.println("No");
//        }

//        StringBuffer buffer=new StringBuffer();
//        for(int i=A.length()-1; i>=0; i--){
//            buffer =buffer.append(A.charAt(i));
//        }
//        if(A.equals(buffer.toString())){
//            System.out.println("Yes");
//        }else {
//            System.out.println("No");
//        }
    }
}