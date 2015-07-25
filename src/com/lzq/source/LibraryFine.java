package com.lzq.source;

import java.util.Scanner;

/**
 * @author luzq
 * @date 2015/7/24 16:21
 */
public class LibraryFine {
    static char[] upper = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
            'X', 'Y', 'Z' };
    static char[] downer = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
            'x', 'y', 'z' };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int strLength = in.nextInt();
        String str = in.next();
        int rotateNumber = in.nextInt();
        StringBuilder sb = new StringBuilder("");
        for(char c : str.toCharArray()){
            if(c >= 'A' && c <= 'Z'){
                int pos = c - 'A';
                pos += rotateNumber;
                pos %= 26;
                sb.append(upper[pos]);
            }else if(c >= 'a' && c <= 'z'){
                int pos = c - 'a';
                pos += rotateNumber;
                pos %= 26;
                sb.append(downer[pos]);
            }else{
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
        in.close();
    }
}
