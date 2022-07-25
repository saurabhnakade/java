package com.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr={6,5,4,3,2,1};
        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int minIdx=i;
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[j]<arr[minIdx]){
                    minIdx=j;
                }
            }
            swap(arr,i,minIdx);
        }
    }

    public static void swap(int[] arr,int i ,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
