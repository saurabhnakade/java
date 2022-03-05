package com.arrays;

import java.util.Scanner;

public class barChart {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();
        int[] arr=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
            if(arr[i]>max)max=arr[i];
        }
        bar(arr,max);
    }

    public static void bar(int[] arr,int max){
        int n=arr.length;

        for(int i=max;i>=1;i--){
            for(int j=0;j<n;j++){
                if(i>arr[j]){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
