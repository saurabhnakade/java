package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class InfixConversions {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String exp=scn.next();

        // code
        Stack<String> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        Stack<String> st3=new Stack<>();

        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);

            if(ch>='a' && ch<='z'){
                st1.push(ch+"");
                st3.push(ch+"");
            }else if(ch=='('){
                st2.push(ch);
            }else if(ch==')'){
                while(st2.peek()!='('){
                    String op2=st1.pop();
                    String op1=st1.pop();
                    char optr1=st2.peek();
                    st1.push(optr1+op1+op2);

                    String opp2=st3.pop();
                    String opp1=st3.pop();
                    char optr2=st2.pop();
                    st3.push(opp1+opp2+optr2);
                }
                st2.pop();

            }else{
                while(st2.size()>0 && precedence(ch)<=precedence(st2.peek())){
                    String op2=st1.pop();
                    String op1=st1.pop();
                    char optr1=st2.peek();
                    st1.push(optr1+op1+op2);

                    String opp2=st3.pop();
                    String opp1=st3.pop();
                    char optr2=st2.pop();
                    st3.push(opp1+opp2+optr2);
                }
                st2.push(ch);
            }
        }
        while(st2.size()>0){
            String op2=st1.pop();
            String op1=st1.pop();
            char optr1=st2.peek();
            st1.push(optr1+op1+op2);

            String opp2=st3.pop();
            String opp1=st3.pop();
            char optr2=st2.pop();
            st3.push(opp1+opp2+optr2);
        }

        System.out.println(st3.pop());
        System.out.println(st1.pop());
    }

    public static int precedence(char ch){
        if(ch=='+'||ch=='-'){
            return 1;
        }else if(ch=='/'||ch=='*'){
            return 2;
        }else{
            return 0;
        }
    }
}
