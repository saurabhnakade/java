package com.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.next();

        ArrayList<String> ans=gss(s);

        System.out.println(ans);
    }

    public static ArrayList<String> gss(String str){
        if(str.length()==0){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }

        char ch=str.charAt(0);
        ArrayList<String> rr=gss(str.substring(1));

        ArrayList<String> ans = new ArrayList<>(rr);
        for (String s : rr) {
            ans.add(ch + s);
        }

        return ans;
    }
}
