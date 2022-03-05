package com.patterns;

import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){

                int n2=n/2;

                if(i==1 && (j<=n2+1 || j==n)){
                    System.out.print("* ");
                }else if(i==n && (j>=n2+1 || j==1)){
                    System.out.print("* ");
                }else if(i==n2+1){
                    System.out.print("* ");
                }else if(i<=n2 && (j==n2+1 || j==n)){
                    System.out.print("* ");
                }else if(i>n2+1 && (j==n2+1 || j==1)){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
