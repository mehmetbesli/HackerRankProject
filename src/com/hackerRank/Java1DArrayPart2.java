package com.hackerRank;

import java.util.Scanner;

/**
 * created by MehmetBesli on 05.2020
 */
public class Java1DArrayPart2 {

    public static boolean canWin(int leap, int[] game) {
        return isSolvable(leap, game, 0);
    }

    private static boolean isSolvable(int leap, int[] game, int number) {
        // Base Cases
        if (number >= game.length) {
            return true;
        } else if (number < 0 || game[number] == 1) {
            return false;
        }

        game[number] = 1;
        return isSolvable(leap, game, number + leap) ||
                isSolvable(leap, game, number + 1) ||
                isSolvable(leap, game, number - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}