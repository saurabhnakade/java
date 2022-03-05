package com.basicsOfProgramming;

import java.util.Scanner;

public class printFibonacciTillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int a=0,b=1;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
