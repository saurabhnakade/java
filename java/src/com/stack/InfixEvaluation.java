package com.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class InfixEvaluation {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String exp=scn.nextLine();

        // code
        Stack<Integer> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();

        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);

            if(ch>='0'&&ch<='9'){
                st1.push(ch-'0');
            }else if(ch=='('){
                st2.push(ch);
            }else if(ch==')'){
                while(st2.peek()!='('){
                    int op2=st1.pop();
                    int op1=st1.pop();
                    char op=st2.pop();
                    int res=solve(op1,op2,op);
                    st1.push(res);
                }
                st2.pop();
            }else if(ch=='+'||ch=='*'||ch=='/'||ch=='-'){
                while(st2.size()>0 && precedence(ch)<=precedence(st2.peek())){
                    int op2=st1.pop();
                    int op1=st1.pop();
                    char op=st2.pop();
                    int res=solve(op1,op2,op);
                    st1.push(res);
                }
                st2.push(ch);
            }
        }

        while(st2.size()!=0){
            int op2=st1.pop();
            int op1=st1.pop();
            char op=st2.pop();
            int res=solve(op1,op2,op);
            st1.push(res);
        }
        System.out.println(st1.peek());
    }

    public static int precedence(char ch){
        if(ch=='+'||ch=='-'){
            return 1;
        }else if(ch=='*'||ch=='/'){
            return 2;
        }else{
            return 0;
        }
    }

    public static int solve(int op1,int op2,char ch){
        if(ch=='+'){
            return op1+op2;
        }else if(ch=='-'){
            return op1-op2;
        }else if(ch=='*'){
            return op1*op2;
        }else{
            return op1/op2;
        }
    }
}
