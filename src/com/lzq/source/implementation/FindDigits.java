package com.lzq.source.implementation;

import java.util.Scanner;

/**
 * @author luzq
 * @date 2015/7/24 16:21
 */
public class FindDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int round = in.nextInt();
        for (int i = 0; i < round; i++) {
            int number = in.nextInt();
            int tmp = number;
            int sum = 0;
            while(tmp > 0){
                int n = tmp % 10;
                if(n != 0 && number % n == 0){
                    sum++;
                }
                tmp /= 10;
            }
            System.out.println(sum);
        }
        in.close();
    }
}
