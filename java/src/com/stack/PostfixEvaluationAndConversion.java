package com.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class PostfixEvaluationAndConversion {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code

        Stack<Integer> st1=new Stack<>();
        Stack<String> st2=new Stack<>();
        Stack<String> st3=new Stack<>();

        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);

            if(ch>='0'&& ch<='9'){
                st1.push(ch-'0');
                st2.push(ch+"");
                st3.push(ch+"");
            }else{
                int op2=st1.pop();
                int op1=st1.pop();
                int ans=solve(op1,op2,ch);
                st1.push(ans);

                String opp2=st2.pop();
                String opp1=st2.pop();
                String ans2="("+opp1+ch+opp2+")";
                st2.push(ans2);

                String oppp2=st3.pop();
                String oppp1=st3.pop();
                st3.push(ch+oppp1+oppp2);
            }
        }

        System.out.println(st1.pop());
        System.out.println(st2.pop());
        System.out.println(st3.pop());
    }

    public static int solve(int op1,int op2,char ch){
        if(ch=='+')return op1+op2;
        if(ch=='-')return op1-op2;
        if(ch=='*')return op1*op2;
        return op1/op2;
    }

}
