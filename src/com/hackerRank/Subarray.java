package com.hackerRank;

        import java.util.Scanner;

/**
 * created by MehmetBesli on 05.2020
 */
public class Subarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthArr = scanner.nextInt();
        int[] a = new int[lengthArr];


        for(int i=0;i<lengthArr;i++){
            a[i]=scanner.nextInt();
        }

        int count = 0;
        for(int i=0; i<a.length; i++ ){
            int sum=0;
            for(int j=i; j<a.length; j++){
                sum +=a[j];
                System.out.println(sum+" : "+a[j]);
                if(sum<0){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}