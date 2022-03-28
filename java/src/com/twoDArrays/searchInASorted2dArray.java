package com.twoDArrays;

import java.util.Scanner;

public class searchInASorted2dArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();

        int[][] arr=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        int target=scn.nextInt();

        int row=0;
        int col=n-1;

        while(row<n && col>=0){
            if(target==arr[row][col]){
                System.out.println(row+"\n"+col);
                return;
            }else if(target>arr[row][col]){
                row++;
            }else{
                col--;
            }
        }

        System.out.println("Not Found");
    }
}
