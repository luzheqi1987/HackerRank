package com.lzq.source;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        int left = 0;
        int right = 0;
        int a;
        t = in.nextInt();
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                a = in.nextInt();
                if (j == i) {
                    left += a;
                }
                if (j == t - i - 1) {
                    right += a;
                }
            }
        }
        System.out.println(Math.abs(left - right));
        in.close();
    }
}
