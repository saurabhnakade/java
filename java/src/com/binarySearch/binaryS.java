package com.binarySearch;

public class binaryS {
    public static void main(String[] args) {
        int[] arr={1,5,10,15,22,33,40,42,55,66};

        System.out.println(bS(arr,1000));

    }
    public static int bS(int[] arr,int data){
        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]==data){
                return mid;
            }else if(arr[mid]<data){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}
