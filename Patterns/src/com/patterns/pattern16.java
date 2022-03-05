package com.patterns;

import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int nsp=2*n-3;
        int nst = 1;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=nst;j++){
                System.out.print(j+" ");
            }

            for(int j=0;j<nsp;j++){
                System.out.print("  ");
            }

            if(i==n){
                nst--;
            }
            for(int j=nst;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
            nsp-=2;
            nst++;
        }
    }
}
