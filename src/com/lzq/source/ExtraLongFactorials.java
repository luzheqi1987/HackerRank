package com.lzq.source;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author luzq
 * @date 2015/7/24 16:21
 */
public class ExtraLongFactorials {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        BigInteger result = new BigInteger("1");
        while(num > 0){
            result = result.multiply(new BigInteger(String.valueOf(num--)));
        }
        
        System.out.println(result);
        in.close();
    }
}
