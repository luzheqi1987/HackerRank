package com.lzq.source.warmup;

import java.util.Scanner;

/**
 * @author luzq
 * @date 2015/7/24 16:21
 */
public class TimeConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        input = in.next();
        boolean isSW = input.endsWith("AM");
        String[] threePart = input.substring(0, input.length()-2).split(":");
        if(isSW){
            if(threePart[0].equals("12")){
                threePart[0]="00";
            }
        }else{
            if(!threePart[0].equals("12")){
                char one = (char) (threePart[0].charAt(0) + 1);
                char two = (char) (threePart[0].charAt(1) + 2);
                threePart[0] = String.valueOf(one) + String.valueOf(two);
            }
        }
        System.out.println(String.join(":", threePart));
        in.close();
    }
}
