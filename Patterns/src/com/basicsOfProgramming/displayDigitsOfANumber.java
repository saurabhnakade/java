package com.basicsOfProgramming;

import java.util.Scanner;

public class displayDigitsOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int digits=0;
        int temp = n;
        while(temp>0){
            digits++;
            temp/=10;
        }

        int pow = (int) Math.pow(10,digits-1);

        for(int i=0;i<digits;i++){
            int x = n/pow;
            n = n%pow;
            pow/=10;
            System.out.println(x);
        }
    }
}
