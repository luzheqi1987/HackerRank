package com.lzq.source.implementation;

import java.util.Scanner;

/**
 * @author luzq
 * @date 2015/7/24 16:21
 */
public class UtopianTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int round = in.nextInt();
        for (int i = 0; i < round; i++) {
            int height = 1;
            int circle = in.nextInt();
            for(int j = 0; j <= circle; j++){
                if(j == 0){
                    continue;
                }else {
                    if(j % 2 == 1){
                        height *= 2;
                    }else{
                        height++;
                    }
                }
            }            
            System.out.println(height);
        }
        in.close();
    }
}
