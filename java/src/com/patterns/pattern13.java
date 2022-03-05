package com.patterns;

import java.util.Scanner;

public class pattern13 {

//    static int fact(int n){
//        int fact = 1;
//        for(int i=2;i<=n;i++){
//            fact*=i;
//        }
//        return fact;
//    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

//        for(int i=0;i<n;i++){
//            for(int j=0;j<=i;j++){
//                int num = fact(i) / (fact(j)*fact(i-j));
//                System.out.print(num+" ");
//            }
//            System.out.println();
//        }

        for(int i=0;i<n;i++){
           int val = 1;
           for(int j=0;j<=i;j++){
               System.out.print(val+" ");
               val = (val*(i-j))/(j+1);
           }
            System.out.println();
        }
    }
}
