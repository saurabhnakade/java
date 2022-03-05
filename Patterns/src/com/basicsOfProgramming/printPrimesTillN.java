package com.basicsOfProgramming;

import java.util.Scanner;

public class printPrimesTillN {
    static boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0)return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int low = scn.nextInt();
        int high = scn.nextInt();

        for(int i=low;i<=high;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
