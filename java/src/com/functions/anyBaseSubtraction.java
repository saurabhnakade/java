package com.functions;

import java.util.Scanner;

public class anyBaseSubtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int base=scn.nextInt();
        int ans=subtraction(n1,n2,base);

        System.out.println(ans);
    }

    public static int subtraction(int n1, int n2, int base) {
        int ans=0;
        int pow=1;
        int borrow=0;

        while(n2>0){
            int d1=n1%10;
            int d2=n2%10;

            int diff=d2-d1-borrow;

            if(diff<0){
                borrow=1;
                diff+=base;
            }else{
                borrow=0;
            }

            ans+=(pow*diff);
            pow*=10;
            n1/=10;
            n2/=10;
        }
        return ans;
    }
}
