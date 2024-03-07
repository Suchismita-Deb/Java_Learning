package org.example.course.Tree;

import java.util.Arrays;

public class practice {
    private static int ans = 0;
    public  static int fun(int count){
        if(count>5) return 0;
        ans++;
        System.out.println(ans);
        return 1+fun(count+1);
    }

    public static int fun1(int[] arr, int res, int count){
        if(res>4) return count;
        count+=arr[res];
        arr[res] = 1;

        return fun1(arr,res+1,count);
    }
    public  static int fun3(int res,int count){
        if(res>5) return count;
        count+=1;
//        System.out.println(ans);
//        return 1+fun(count+1);
//        System.out.println(count);
        return fun3(res+1,count);
    }
    public static void main(String[] args) {
        System.out.println(fun(0));
        int[] list = {7,8,9,0,8};
        System.out.println(fun1(list,0,0));
        System.out.println(Arrays.toString(list));
        System.out.println(fun3(0,0));
    }
}
