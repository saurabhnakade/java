package com.binarySearch;

import java.util.Scanner;

public class firstAndLastO {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int d=scn.nextInt();

        System.out.println(search(arr,d,true));
        System.out.println(search(arr,d,false));
    }

    public static int search(int[] arr,int target,boolean firstO){
        int ans=-1;
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+((end-start)/2);

            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                ans=mid;
                if(firstO){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
