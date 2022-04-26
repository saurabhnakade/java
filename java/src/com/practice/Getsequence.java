package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Getsequence {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.next();
        ArrayList<String> x=gss(s);
        System.out.println(x);
    }

    public static ArrayList<String> gss(String s){
        if(s.length()==0){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }

        char ch=s.charAt(0);
        String sub=s.substring(1);

        ArrayList<String> rfr=gss(sub);

        ArrayList<String> ans=new ArrayList<>(rfr);
        for(int i=0;i<rfr.size();i++){
            ans.add(ch+rfr.get(i));
        }

        return ans;
    }
}
