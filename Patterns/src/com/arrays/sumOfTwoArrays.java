package com.arrays;

import java.util.Scanner;

public class sumOfTwoArrays {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n1=scn.nextInt();
        int[] N1=new int[n1];
        for(int i=0;i<n1;i++){
            N1[i]=scn.nextInt();
        }

        int n2=scn.nextInt();
        int[] N2=new int[n2];
        for(int i=0;i<n2;i++){
            N2[i]=scn.nextInt();
        }

        int[] ans=new int[(n1>n2 ? n1:n2)+1];

        int i=N1.length-1;
        int j=N2.length-1;
        int k=ans.length-1;

        int carry=0;

        while(k>=0) {
            int sum = 0;
            if (i >= 0) sum += N1[i];
            if (j >= 0) sum += N2[j];
            sum += carry;

            int rem = sum % 10;
            int quo = sum / 10;

            ans[k] = rem;
            carry = quo;

            k--;
            i--;
            j--;
        }

        for(int l=0;l<ans.length;l++){
            if(l==0 && ans[l]==0)continue;
            System.out.print(ans[l]+" ");
        }
    }
}
