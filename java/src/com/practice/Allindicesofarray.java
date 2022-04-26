package com.practice;

import java.util.Scanner;

public class Allindicesofarray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int x=scn.nextInt();

        int[] ans=aIoA(arr,x,0,0);
        for(int a:ans){
            System.out.print(a+" ");
        }
    }

    public static int[] aIoA(int[] arr,int x, int idx,int fsf){
        if(idx==arr.length){
            int[] ans=new int[fsf];
            return ans;
        }

        if(arr[idx]==x){
            int[] ans=aIoA(arr,x,idx+1,fsf+1);
            ans[fsf]=idx;
            return ans;
        }else{
            return aIoA(arr,x,idx+1,fsf);
        }
    }
}
