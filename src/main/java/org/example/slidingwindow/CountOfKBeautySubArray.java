package org.example.slidingwindow;

public class CountOfKBeautySubArray {
    public static void main(String[] args) {
        String str = "240";
        int k=2;
        StringBuilder s = new StringBuilder();
        int num = Integer.valueOf(str);
        int count=0;
        int i=0,j=0;
        while(j<str.length()){
            s.append(str.charAt(j));
            if(j-i+1==k){
                String s1 = String.valueOf(s);
                int a = Integer.valueOf(s1);
                System.out.println(a);
                if(num%a==0){
                    count++;
                }
                s.deleteCharAt(0); // no need to delete i as i have to just delete the first element so I can delete the 0th value.
                i++;
            }
            j++;
        }
        System.out.println(count);
    }
}
