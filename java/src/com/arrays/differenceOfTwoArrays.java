package com.arrays;

import java.util.Scanner;

public class differenceOfTwoArrays {
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

        int n3=Math.max(n1,n2);
        int[] ans=new int[n3];

        int i=N1.length-1;
        int j=N2.length-1;
        int k=ans.length-1;

        int borrow=0;

        while(k>=0){
            int d1=0;
            int d2=0;

            if(i>=0)d1=N1[i];
            if(j>=0)d2=N2[j];

            int diff=d1-d2-borrow;

            if(diff<0){
                borrow=1;
                diff+=10;
            }else{
                borrow=0;
            }

            ans[k]=diff;

            i--;
            j--;
            k--;
        }

        int l=0;
        while(ans[l]==0){
            l++;
        }
        for(;l<ans.length;l++){
            System.out.print(ans[l]+" ");
        }

    }
}
