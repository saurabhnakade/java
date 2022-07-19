package com.recursion;

import java.util.Scanner;

public class PrintKPC {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        String str= scn.next();
        printKPC(str,"");
    }

    static String[] arr={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printKPC(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }

        char ch=str.charAt(0);
        String ros=str.substring(1);

        String code=arr[ch-'0'];

        for(int i=0;i<code.length();i++){
            printKPC(ros, asf+code.charAt(i));
        }
    }
}
