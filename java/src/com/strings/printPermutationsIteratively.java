package com.strings;

import java.util.*;

public class printPermutationsIteratively {
    public static void solution(String str){
        int n=str.length();
        int fact=factorial(n);

        for(int i=0;i<fact;i++){
            StringBuilder sb=new StringBuilder(str);
            int temp=i;
            for(int div=n;div>0;div--){
                 int rem=temp%div;
                 System.out.print(sb.charAt(rem));
                 sb.deleteCharAt(rem);
                 temp/=div;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

    public static int factorial(int n){
        int val=1;
        for(int i=2;i<=n;i++){
            val*=i;
        }
        return val;
    }
}
