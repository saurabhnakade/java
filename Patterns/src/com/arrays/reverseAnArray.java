package com.arrays;

import java.util.Scanner;

public class reverseAnArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n= scn.nextInt();
        int[] a=new int[n];

        for(int i=0;i<a.length;i++){
            a[i]= scn.nextInt();
        }

        for(int start=0,end=a.length-1;start<end;start++,end--){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

