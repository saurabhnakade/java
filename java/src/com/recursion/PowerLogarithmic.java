package com.recursion;

import java.util.Scanner;

public class PowerLogarithmic {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();

        System.out.println(power(x,n));
    }

    public static int power(int x, int n){
        if(n==0)return 1;

        int ans=power(x,n/2);
        ans*=ans;

        if(n%2==0){
            return ans;
        }

        return ans*x;
    }
}
