package com.strings;

import java.util.Scanner;

public class stringCompression {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        String s=scn.next();

        System.out.println(compression1(s));
        System.out.println(compression2(s));
    }

    public static String compression1(String s){
        String comp1=s.charAt(0)+"";

        for(int i=1;i<s.length();i++){
            if(comp1.charAt(comp1.length()-1)!=s.charAt(i)){
                comp1+=s.charAt(i);
            }
        }
        return comp1;
    }

    public static String compression2(String s){
        String comp2="";
        comp2+=s.charAt(0);

        int count =1;
        for(int i=1;i<s.length();i++){
            if(comp2.charAt(comp2.length()-1)==s.charAt(i)){
                count++;
            }else{
                if(count>1){
                    comp2+=count;
                }
                comp2+=s.charAt(i);
                count=1;
            }
        }

        if(count>1){
            comp2+=count;
        }
        return comp2;
    }
}
