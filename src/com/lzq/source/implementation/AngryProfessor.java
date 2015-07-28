package com.lzq.source.implementation;

import java.util.Scanner;

/**
 * @author luzq
 * @date 2015/7/24 16:21
 */
public class AngryProfessor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int round = in.nextInt();
        for(int i = 0; i < round; i++){
            int allNumber = in.nextInt();
            int needNumber = in.nextInt();
            int actualNumber = 0;
            for(int j = 0; j < allNumber;j++){
                int come = in.nextInt();
                if(come <= 0){
                    actualNumber++;
                }
            }
            if(actualNumber >= needNumber){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
        in.close();
    }
}
