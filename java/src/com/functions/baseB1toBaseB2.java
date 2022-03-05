package com.functions;

import java.util.Scanner;

public class baseB1toBaseB2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int  destBase= scn.nextInt();
        int ans=baseB1toB2(n,sourceBase,destBase);
        System.out.println(ans);
    }

    public static int baseB1toB2(int n, int sourceBase, int destBase) {
        int decimal=getValueIndecimal(n,sourceBase);
        return getValueInBase(decimal,destBase);
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

    public static int getValueIndecimal(int n, int b){
        int ans=0;
        int pow=1;
        while(n>0){
            ans+= (n%10)*pow;
            pow*=b;
            n/=10;
        }
        return ans;
    }
}
