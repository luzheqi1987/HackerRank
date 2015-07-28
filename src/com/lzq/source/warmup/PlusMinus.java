package com.lzq.source.warmup;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.0000");
        int t;
        int zeroNumber = 0;
        int plusNumber = 0;
        int minusNumber = 0;
        int a;
        t = in.nextInt();
        for (int i = 0; i < t; i++) {
            a = in.nextInt();
            if(a > 0){
                plusNumber++;
            }else if(a < 0){
                minusNumber++;
            }else{
                zeroNumber++;
            }
        }
        System.out.println(df.format((double)plusNumber/ t));
        System.out.println(df.format((double)minusNumber/ t));
        System.out.println(df.format((double)zeroNumber/ t));
        in.close();
    }
}
