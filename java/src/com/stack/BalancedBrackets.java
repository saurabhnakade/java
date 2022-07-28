package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String s =scn.nextLine();

        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }else{
                if(ch==')'){
                    if(!check(st,'(')){
                        System.out.println("false");
                        return;
                    }
                }else if(ch==']'){
                    if(!check(st,'[')){
                        System.out.println("false");
                        return;
                    }
                }else if(ch=='}'){
                    if(!check(st,'{')){
                        System.out.println("false");
                        return;
                    }
                }
            }
        }
        if(st.size()!=0){
            System.out.println("false");
        }else{
            System.out.println("true");
        }

    }

    public static boolean check(Stack<Character> st,char bracket){
        if(st.size()==0)return false;
        if(st.peek()!=bracket)return false;

        st.pop();
        return true;
    }
}
