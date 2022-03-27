package com.practice;

import java.util.Scanner;

public class spiralQ {
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

        int rmin=0;
        int rmax=n-1;
        int cmin=0;
        int cmax=m-1;

        int count=0;
        int total=n*m;

        while(count<total){
            for(int col=cmin;col<=cmax && count<total;col++){
                System.out.println(arr[rmin][col]);
                count++;
            }
            rmin++;
            for(int row=rmin;row<=rmax && count<total;row++){
                System.out.println(arr[row][cmax]);
                count++;
            }
            cmax--;
            for(int col=cmax;col>=cmin && count<total;col--){
                System.out.println(arr[rmax][col]);
                count++;
            }
            rmax--;
            for(int row=rmax;row>=rmin && count<total;row--){
                System.out.println(arr[row][cmin]);
                count++;
            }
            cmin++;
        }
    }
}
