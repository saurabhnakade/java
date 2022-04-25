package com.recursion;

import java.util.Scanner;

public class PowerLinear {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int n= scn.nextInt();
        System.out.println(power(x,n));
    }

    public static int power(int x, int n){
        if(n==1)return x;
        return x*power(x,n-1);
    }
}
