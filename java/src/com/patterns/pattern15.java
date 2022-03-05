package com.patterns;

import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int nsp=n/2;
        int nst=1;

        for(int i=1;i<=n;i++){
            int x;
            if(i<=(n/2)+1){
                x=i;
            }else{
                x=n-i+1;
            }
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }

            for(int j=1;j<=nst;j++){
                System.out.print(x+" ");
                if(j<=nst/2){
                    x++;
                }else{
                    x--;
                }
            }
            System.out.println();

            if(i<=n/2){
                nsp--;
                nst+=2;
            }else{
                nsp++;
                nst-=2;
            }
        }
    }
}
