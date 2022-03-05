package com.patterns;

import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();

        int nst=1;
        for(int i=1;i<=n;i++){
            if(i!=(n/2)+1){
                for(int j=0;j<n/2;j++){
                    System.out.print("  ");
                }
            }else{
                for(int j=0;j<n/2;j++) {
                    System.out.print("* ");
                }
            }

            for(int j=0;j<nst;j++){
                System.out.print("* ");
            }

            if(i<=n/2){
                nst++;
            }else{
                nst--;
            }

            System.out.println();
        }
    }
}
