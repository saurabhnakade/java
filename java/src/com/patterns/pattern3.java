package com.patterns;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int nsp = n-1;
        int nst = 1;

        for(int i=0;i<n;i++){
            for(int j=0;j<nsp;j++){
                System.out.print("  ");
            }
            for(int j=0;j<nst;j++){
                System.out.print("* ");
            }
            System.out.println();

            nsp--;
            nst++;
        }
    }
}
