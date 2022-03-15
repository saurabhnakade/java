package com.binarySearch;

public class brokenEconomy {
    public static void main(String[] args) {
        int[] arr={1,5,10,15,22,33,40,42,55,66};

        brokenE(arr,34);
    }

    public static void brokenE(int[] arr,int den){
        int left=0;
        int right=arr.length-1;
        int floor=-1;
        int ceil=-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]==den){
                floor=arr[mid];
                ceil=arr[mid];
                break;
            }else if(arr[mid]<den){
                left=mid+1;
                floor=arr[mid];
            }else if(arr[mid]>den){
                right=mid-1;
                ceil=arr[mid];
            }
        }

        System.out.println(ceil);
        System.out.println(floor);
    }
}
