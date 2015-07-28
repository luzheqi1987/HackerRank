package com.lzq.source.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author luzq
 * @date 2015/7/24 16:21
 */
public class SongofPi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final String PI = "31415926535897932384626433833";
        int round = in.nextInt();
        in.nextLine();
        for (int i = 0; i < round; i++) {
            String line = in.nextLine();
            String[] words = line.trim().split(" ");
            StringBuilder sb = new StringBuilder("");
            for(String word: words){
                sb.append(word.length());
            }
            if(sb.toString().equals(PI.substring(0, sb.length()))){
                System.out.println("It's a pi song.");
            }else{
                System.out.println("It's not a pi song.");
            }
        }
        in.close();
    }
}
