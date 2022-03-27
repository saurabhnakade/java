package com.twoDArrays;

import java.util.Scanner;

public class saddlePrice {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();

        int[][] arr=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j = 0; j<n; j++){
                arr[i][j]=scn.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            int minI=0;
            for(int col=0;col<arr.length;col++){
                if(arr[i][col]<arr[i][minI])minI=col;
            }
            int maxI=0;
            for(int row=0;row<n;row++){
                if(arr[row][minI]>arr[maxI][minI])maxI=row;
            }
            if(arr[i][minI]==arr[maxI][minI]){
                System.out.println(arr[i][minI]);
                return;
            }
        }

        System.out.println("Invalid input");
    }
}
