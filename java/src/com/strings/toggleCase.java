package com.strings;

import java.util.Scanner;

public class toggleCase {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        String s=scn.next();

        StringBuilder ans= new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<'a'){
                ans.append((char) (s.charAt(i) + ('a' - 'A')));
            }else{
                ans.append((char) (s.charAt(i) - ('a' - 'A')));
            }
        }

        System.out.println(ans);

    }
}
