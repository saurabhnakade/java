package com.recursion;

import java.util.Scanner;

public class PrintMazePaths {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();

        printMazePaths(1,1,n,m,"");

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sc>dc||sr>dr){
            return;
        }
        if(sc==dc&&sr==dr){
            System.out.println(psf);
            return;
        }

        printMazePaths(sr,sc+1,dr,dc,psf+'h');
        printMazePaths(sr+1,sc,dr,dc,psf+'v');
    }
}
