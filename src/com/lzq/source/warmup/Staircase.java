package com.lzq.source.warmup;

import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            for(int j = 0; j < t - i - 1; j++){
                System.out.print(' ');
            }
            for(int j = 0; j <= i; j++){
                System.out.print("#");
            }
            System.out.println();
        }
        in.close();
    }

}
