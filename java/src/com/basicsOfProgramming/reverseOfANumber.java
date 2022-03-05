package com.basicsOfProgramming;

import java.util.Scanner;

public class reverseOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        while(n>0){
            System.out.println(n%10);
            n/=10;
        }
    }
}
