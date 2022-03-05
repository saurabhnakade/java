package com.functions;

import java.util.Scanner;

public class anyBaseAddition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int base=scn.nextInt();
        int ans=addition(n1,n2,base);

        System.out.println(ans);
    }

    public static int addition(int n1,int n2, int base){
        int carry=0;
        int pow=1;
        int ans=0;

        while(n1>0 || n2>0){
            int d1=n1%10;
            int d2=n2%10;
            int sum=d1+d2+carry;
            int d=sum%base;
            carry=sum/base;
            ans+=(d*pow);
            pow*=10;
            n1/=10;
            n2/=10;
        }
        ans+=(carry*pow);
        return ans;
    }
}
