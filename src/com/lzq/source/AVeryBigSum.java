package com.lzq.source;

import java.util.Scanner;

/**
 * @author luzq
 * @date 2015/7/24 16:21
 */
public class AVeryBigSum {
    static String stringAdd(String a, String b) {
        if(b.length() > a.length()){
            String tmp = b;
            b = a;
            a = tmp;
        }
        int c = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < b.length(); i++){
            int sumI = a.charAt(a.length()-1-i) - '0';
            int aI = b.charAt(b.length()-1-i) - '0';
            int addI = sumI + aI + c;
            sb.append(addI % 10);
            c = addI / 10;
        }
        for(int i = b.length(); i < a.length(); i++){
            int sumI = a.charAt(a.length()-1-i) - '0';
            int addI = sumI + c;
            sb.append(addI % 10);
            c = addI / 10;
        }
        if(c > 0){
            sb.append("1");
        }
        return sb.reverse().toString();
    }

    static String stringSub(String a, String b) {
        boolean isFuShu = false;
        if(b.compareTo(a) > 0){
            String tmp = b;
            b = a;
            a = tmp;
            isFuShu = true;
        }else if(b.compareTo(a) == 0){
            return "0";
        }
        int c = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < b.length(); i++){
            int sumI = a.charAt(a.length()-1-i) - '0';
            int aI = b.charAt(b.length()-1-i) - '0';
            int addI = sumI - aI - c;
            sb.append(addI < 0 ? 10 + addI : addI);
            c = addI < 0 ? 1 : 0;
        }
        for(int i = b.length(); i < a.length(); i++){
            int sumI = a.charAt(a.length()-1-i) - '0';
            int addI = sumI - c;
            sb.append(addI < 0 ? -addI : addI);
            c = addI < 0 ? 1 : 0;
        }
        String result= sb.reverse().toString();
        int index = 0;
        while(index < result.length() && result.charAt(index++) == '0');
        if(index >= result.length()){
            return "0";
        }
        return isFuShu ? "-"+result.substring(index): result.substring(index);
    }

    static String add(String a, String b) {
        boolean isAFuShu = a.startsWith("-");
        boolean isBFuShu = b.startsWith("-");
        if(isAFuShu && !isBFuShu){
            return stringSub(b ,a.substring(1));
        }else if(!isAFuShu && isBFuShu){
            return stringSub(a ,b.substring(1));
        }else if(isAFuShu && isBFuShu){
            return "-" + stringAdd(a.substring(1) ,b.substring(1));
        }else{
            return stringAdd(a ,b);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        long sum = 0;
        long a;
        t = in.nextInt();
        for (int i=0;i<t;i++) {
            a = in.nextLong();
            sum += sum + a;
        }
        System.out.println(sum);
        in.close();
    }
}
