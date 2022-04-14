package com.strings;

import java.util.Scanner;

public class stringWithDiffof2Consecutive {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        String str=scn.next();

        StringBuilder ans=new StringBuilder();

        for(int i=0;i<str.length();i++){
            ans.append(str.charAt(i));
            if(i!=str.length()-1){
                ans.append(str.charAt(i+1)-str.charAt(i));
            }
        }

        System.out.println(ans);
    }
}
