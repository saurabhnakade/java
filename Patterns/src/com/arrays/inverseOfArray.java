package com.arrays;

import java.util.Scanner;

public class inverseOfArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }

        int[] ans=inverse(a);

        for (int an : ans) {
            System.out.print(an + " ");
        }
    }

    public static int[] inverse(int[] a) {
        int[] ans=new int[a.length];
        for(int i=0;i<a.length;i++){
            ans[a[i]]=i;
        }
        return ans;
    }
}
