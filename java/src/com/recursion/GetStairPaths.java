package com.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPaths {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        ArrayList<String> ans=new ArrayList<>();

        System.out.println(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String> temp=new ArrayList<>();
            temp.add("");
            return temp;
        }
        if(n<0){
            ArrayList<String> temp=new ArrayList<>();
            return temp;
        }
        ArrayList<String> rr1=getStairPaths(n-1);
        ArrayList<String> rr2=getStairPaths(n-2);
        ArrayList<String> rr3=getStairPaths(n-3);

        ArrayList<String> ans=new ArrayList<>();

        for (String s : rr1) {
            ans.add('1' + s);
        }
        for (String s : rr2) {
            ans.add('2' + s);
        }
        for (String s : rr3) {
            ans.add('3' + s);
        }

        return ans;
    }
}

