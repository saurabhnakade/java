package com.practice;

import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        Map<Integer,Integer> m=new HashMap<>();
        m.put(1,0);
        m.put(2,1);
        m.put(3,2);

        m.put(1,m.get(1)+1);

        System.out.println(m);
    }
}
