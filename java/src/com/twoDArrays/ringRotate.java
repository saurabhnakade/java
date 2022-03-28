package com.twoDArrays;

import java.util.Scanner;

public class ringRotate {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();
        int m=scn.nextInt();

        int[][] arr=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        int s=scn.nextInt();
        int r=scn.nextInt();

        // 1D array fill
        int[] target=fillOneDArray(arr,s);
        // Rotate 1D array
        rotate(target,r);
        
        // Fill the array back
        fillBackShell(arr,s,target);

        // Printing back
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static int[] fillOneDArray(int[][] arr,int s){
        int rmin=s-1;
        int rmax=arr.length-s;
        int cmin=s-1;
        int cmax=arr[0].length-s;

        int total=2*(rmax-rmin+cmax-cmin);
        int[] target=new int[total];
        int k=0;
        for(int row=rmin;row<=rmax;row++) {
            target[k++]=arr[row][cmin];
        }
        cmin++;//1
        for(int col=cmin;col<=cmax;col++) {
            target[k++]=arr[rmax][col];
        }
        rmax--;//2
        for(int row=rmax;row>=rmin;row--){
            target[k++]=arr[row][cmax];
        }
        cmax--;//2
        for(int col=cmax;col>=cmin;col--){
            target[k++]=arr[rmin][col];
        }
        return target;
    }
    public static void fillBackShell(int[][] arr,int s,int[] target){
        int rmin=s-1;
        int rmax=arr.length-s;
        int cmin=s-1;
        int cmax=arr[0].length-s;

        int k=0;
        for(int row=rmin;row<=rmax;row++) {
            arr[row][cmin]=target[k++];
        }
        cmin++;//1
        for(int col=cmin;col<=cmax;col++) {
            arr[rmax][col]=target[k++];
        }
        rmax--;//2
        for(int row=rmax;row>=rmin;row--){
            arr[row][cmax]=target[k++];
        }
        cmax--;//2
        for(int col=cmax;col>=cmin;col--){
            arr[rmin][col]=target[k++];
        }
    }

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
        for(;start<end;start++,end--){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
        }
    }
}
