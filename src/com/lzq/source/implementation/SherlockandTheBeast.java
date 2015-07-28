package com.lzq.source.implementation;

import java.util.Scanner;

/**
 * @author luzq
 * @date 2015/7/24 16:21
 */
public class SherlockandTheBeast {
    public static void main(String[] args) {        
        final String FIVE = "555";
        final String THREE = "33333";
        Scanner in = new Scanner(System.in);
        int round = in.nextInt();
        for (int i = 0; i < round; i++) {
            int N = in.nextInt();
            if (N % 3 == 0) {
                for (int j = 0; j < N / 3; j++) {
                    System.out.print(FIVE);
                }
            } else {
                int fiveNumber = 0;
                int n = N;
                while (n > 0 && n % 3 != 0) {
                    fiveNumber++;
                    n -= 5;
                }
                if (n < 0) {
                    if (n % 5 == 0) {
                        for (int j = 0; j < N / 3; j++) {
                            System.out.print(THREE);
                        }
                    } else {
                        System.out.print("-1");
                    }
                } else {
                    for (int i1 = 0; i1 < n / 3; i1++) {
                        System.out.print(FIVE);
                    }
                    for (int i2 = 0; i2 < fiveNumber; i2++) {
                        System.out.print(THREE);
                    }
                }
            }
            System.out.println();
        }
        in.close();
    }
}
