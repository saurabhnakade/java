package com.functions;

import java.util.Scanner;

public class decimalToBaseB {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
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
