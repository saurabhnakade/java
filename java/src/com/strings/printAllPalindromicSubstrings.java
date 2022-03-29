package com.strings;

import java.util.Scanner;

public class printAllPalindromicSubstrings {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String temp=str.substring(i,j);
                if(isPalindrome(temp)){
                    System.out.println(temp);
                }
            }
        }
    }

    public static boolean isPalindrome(String temp){
        for(int i=0,j=temp.length()-1;i<j;i++,j--){
            if(temp.charAt(i)!=temp.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
