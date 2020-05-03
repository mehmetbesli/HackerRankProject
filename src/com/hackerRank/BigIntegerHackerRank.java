package com.hackerRank;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * created by MehmetBesli on 05.2020
 */
public class BigIntegerHackerRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger num1,num2;
        BigInteger sum,multiply;

        num1=sc.nextBigInteger();
        num2=sc.nextBigInteger();
        sum=num1.add(num2);
        multiply=num1.multiply(num2);

        System.out.println(sum);
        System.out.println(multiply);
    }
}