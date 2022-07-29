package com.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class NextGreaterToTheLeft {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val+"\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] ngl = solve(a);
        display(ngl);
    }

    public static int[] solve(int[] arr) {
        // solve
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(arr[0]);
        ans[0]=-1;

        for(int i=1;i<arr.length-1;i++){
            while(st.size()>0 && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.size()==0){
                ans[i]=-1;
            }else{
                ans[i]=st.peek();
            }
            st.push(arr[i]);
        }

        return ans;
    }
}
