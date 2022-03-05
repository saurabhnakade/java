package com.patterns;

import java.util.Scanner;

public class pattern20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n= scn.nextInt();

        for(int i=1;i<=n;i++){
            int n2=n/2;
            for(int j=1;j<=n;j++){
                if(i>=n2+1 && i<n && ((i+j)==n+1 || (i-j)==0)){
                    System.out.print("* ");
                }else if(j==1 || j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
