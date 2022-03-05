package com.patterns;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int nst = 1;
        int nsp = n/2;

        for(int i=0;i<n;i++){
            for(int j=0;j<nsp;j++){
                System.out.print("  ");
            }
            for(int j=0;j<nst;j++){
                System.out.print("* ");
            }
            System.out.println();

            if(i<n/2){
                nsp--;
                nst+=2;
            }else{
                nsp++;
                nst-=2;
            }
        }
    }
}
