package org.example.practice;

public class PowerOf2 {
    public static void main(String[] args) {
        int a = 128;
        int count = 0;
        while(a>1){
            if(a%2!=0){
                count = 1;
                System.out.println("No");
                break;
            }
            a=a/2;
        }
        if(count==0)
        System.out.println("Yes");
    }
}
