package com.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class LargestAreaHistogram {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        // code

        int[] rb=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        rb[arr.length-1]=arr.length;
        st.push(arr.length-1);

        for(int i=arr.length-2;i>=0;i--){
            while(st.size()>0 && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.size()==0){
                rb[i]=arr.length;
            }else{
                rb[i]=st.peek();
            }

            st.push(i);
        }

        int[] lb=new int[arr.length];
        st=new Stack<>();
        st.push(0);
        lb[0]=-1;

        for(int i=1;i<arr.length;i++){
            while(st.size()>0&& arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.size()==0){
                lb[i]=-1;
            }else{
                lb[i]=st.peek();
            }
            st.push(i);
        }

        int max=0;
        for(int i=0;i<arr.length;i++){
            int area=arr[i]*(rb[i]-lb[i]-1);
            if(area>max)max=area;
        }

        System.out.println(max);
    }

}
