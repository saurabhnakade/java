package com.patterns;

import java.util.Scanner;

public class pattern10 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int nsp = n/2;
        int nst = 1;
        int nsp2 = -1;

        for(int i=0;i<n;i++){

            for(int j=0;j<nsp;j++){
                System.out.print("  ");
            }
            System.out.print("* ");
            for(int j=0;j<nsp2;j++){
                System.out.print("  ");
            }

            if(i!=0 && i!=n-1){
                System.out.print("* ");
            }

            if(i<n/2){
                nsp--;
                nsp2 += 2;
            }else{
                nsp++;
                nsp2 -=2;
            }

            System.out.println();
        }
    }
}
