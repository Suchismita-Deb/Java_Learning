package org.example.slidingwindow;

public class minRecolorToGetKBlock {
    public static void main(String[] args) {
        String str="WBWBBBW";
        int i=0,j=0,count=0,min = Integer.MAX_VALUE;
        int k=2;
        while(j<str.length()){
            if(str.charAt(j) == 'W'){
                count++;
            }
            if(j-i+1==k){
                min = Math.min(count,min);
//                while(str.charAt(i)!='W'){
//                    i++;
//                }
//                count--;

                if(str.charAt(i)=='W'){
                    count--;
                }
                i++;
            }
            j++;
        }
        System.out.println(min);
    }
}
