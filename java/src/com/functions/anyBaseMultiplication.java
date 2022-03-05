package com.functions;

import java.util.Scanner;

public class anyBaseMultiplication {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int base=scn.nextInt();

        int ans=finalMul(n1,n2,base);
        System.out.println(ans);
    }

    public static int finalMul(int n1,int n2,int base){
        int ans=0;
        int pow=1;

        while(n2!=0){
            int temp=n2%10;
            n2/=10;
            int tAns=multiplication(n1,temp,base);
            ans=addition(ans,tAns*pow,base);
            pow*=10;
        }
        return ans;
    }

    public static int multiplication(int n1,int d,int base){
        int ans=0;
        int pow=1;
        int carry=0;

        while (n1!=0 || carry!=0){
            int ld=n1%10;
            n1/=10;

            int product=ld*d+carry;
            int rem=product%base;
            int quo=product/base;

            ans+=(rem*pow);
            pow*=10;
            carry=quo;
        }
        return ans;
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
