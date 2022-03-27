package com.twoDArrays;

import java.util.Scanner;

public class rotateBy90Degree {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();
        int m=scn.nextInt();

        int[][] arr=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        //Transpose :  Mirror over diagonal
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i<j){
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
        }

        // Mirror over central vertical line
        for(int k=0;k<arr.length;k++){
            for(int i=0,j=arr[0].length-1;i<j;i++,j--){
                int temp=arr[k][i];
                arr[k][i]=arr[k][j];
                arr[k][j]=temp;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
 