package com.hackerRank;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * created by MehmetBesli on 05.2020
 */
public class PrimalityTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String number = scanner.nextLine();
        BigInteger bigInteger=new BigInteger(number);
        boolean probablePrime = bigInteger.isProbablePrime(1);
        if(probablePrime){
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }
    }
}