package com.arrayList;

import java.util.ArrayList;

public class arrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(30);
        al.add(20);
        al.add(10);
        al.set(2,0);
        al.set(2,40);

        al.add(2,0);
        al.remove(0);

        System.out.println(al);

    }
}
