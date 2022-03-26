package com.twoDArrays;

import java.util.Scanner;

public class spiralDisplay {
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
        int rmax=arr.length-1;//3
        int cmin=0;
        int cmax=arr[0].length-1;//3

        int count=0;

        while(count<n*m){
            for(int row=rmin;row<=rmax && count<n*m;row++){
                System.out.println(arr[row][cmin]);
                count++;
            }
            cmin++;//1
            for(int col=cmin;col<=cmax && count<n*m;col++){
                System.out.println(arr[rmax][col]);
                count++;
            }
            rmax--;//2
            for(int row=rmax;row>=rmin && count<n*m;row--){
                System.out.println(arr[row][cmax]);
                count++;
            }
            cmax--;//2
            for(int col=cmax;col>=cmin && count<n*m;col--){
                System.out.println(arr[rmin][col]);
                count++;
            }
            rmin++;//1
        }
    }
}
