package com.twoDArrays;

import java.util.Scanner;

public class exitPointOfAMatrix {
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

        int row=0;
        int col=0;
        int dir=0;

        while(true){
            dir=(dir+arr[row][col])%4;
            if(dir==0){
                col++;
            }else if(dir==1){
                row++;
            }else if(dir==2){
                col--;
            }else{
                row--;
            }

            if(row<0){
                row++;
                break;
            }else if(col<0){
                col++;
                break;
            }else if(row==arr.length){
                row--;
                break;
            }else if(col==arr[0].length){
                col--;
                break;
            }
        }

        System.out.println(row+" "+col);
    }
}
