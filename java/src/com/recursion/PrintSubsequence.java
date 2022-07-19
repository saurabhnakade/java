package com.recursion;

import java.util.Scanner;

public class PrintSubsequence {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();

        printSS(str,"");
    }

    public static void printSS(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }

        char ch=str.charAt(0);
        String ros=str.substring(1);

        printSS(ros,asf+ch);
        printSS(ros,asf);
    }
}
