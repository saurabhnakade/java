package com.arrays;

import java.util.Scanner;

public class rotateAnArray {

    public static void rotate(int[] a, int k){
        // write your code here
        int n=a.length;
        k=k%n;

        if(k<0)k+=n;
        reverse(a,0,n-1);
        reverse(a,0,k-1);
        reverse(a,k,n-1);
    }

    public static void reverse(int[] a, int start,int end){
        // write your code here
        for(;start<end;start++,end--){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }

        rotate(a,5);

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
