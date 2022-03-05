package com.arrays;

import java.util.Scanner;

public class spanOfArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();
        int[] arr=new int[n];

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
            if(arr[i]<min)min=arr[i];
            if(arr[i]>max)max=arr[i];
        }
        int span=max-min;
        System.out.println(span);
    }
}
