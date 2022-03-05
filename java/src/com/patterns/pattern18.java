package com.patterns;

import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();

        int nst = n;
        int nsp = 0;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){
                if(i<=n/2 && i!=1){
                    if(j==1 || j==nst) {
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }else{
                    System.out.print("* ");
                }

            }

            System.out.println();
            if(i<=n/2){
                nst-=2;
                nsp++;
            }else{
                nst+=2;
                nsp--;
            }
        }
    }
}
