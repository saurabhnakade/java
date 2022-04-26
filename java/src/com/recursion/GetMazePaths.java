package com.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePaths {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();

        ArrayList<String> ans=getMazePaths(0,0,n-1,m-1);
        System.out.println(ans);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr>dr||sc>dc){
            ArrayList<String> temp=new ArrayList<>();
            return temp;
        }
        if(sr==dr && sc==dc){
            ArrayList<String> temp=new ArrayList<>();
            temp.add("");
            return temp;
        }

        ArrayList<String> rrh =getMazePaths(sr,sc+1,dr,dc);
        ArrayList<String> rrv=getMazePaths(sr+1,sc,dr,dc);

        ArrayList<String> ans=new ArrayList<>();
        for(String s:rrh){
            ans.add("h"+s);
        }
        for(String s:rrv){
            ans.add("v"+s);
        }

        return ans;
    }
    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
}
