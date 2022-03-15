package com.arrays;

import java.util.Scanner;

public class subsetsOfAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        int ts=(int)Math.pow(2,n);

        for(int i=0;i<ts;i++){
            int binary=getValueInBase(i,2);

            int pow=(int)Math.pow(10,n-1);

            for(int j=0;j<n;j++){
                int q=binary/pow;
                int rem=binary%pow;
                if(q==1){
                    System.out.print(arr[j]+" ");
                }else{
                    System.out.print("_ ");
                }
                binary=rem;
                pow/=10;
            }
            System.out.println();
        }

    }

    public static int getValueInBase(int n, int b){
        int ans=0;
        int pow=1;
        while(n>0){
            ans += pow*(n%b);
            n=n/b;
            pow*=10;
        }
        return ans;
    }
}
