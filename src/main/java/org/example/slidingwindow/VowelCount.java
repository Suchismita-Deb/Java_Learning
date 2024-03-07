package org.example.slidingwindow;

public class VowelCount {
    public static void main(String[] args) {
        vowelCount();
        System.out.println(1&8);
    }

    private static void vowelCount() {
        String str = "abciiidef";
        int k=3;
        int i=0,j=0,count=0;
        int max = Integer.MIN_VALUE;
        while(j<str.length()){
            if(str.charAt(j)=='a' || str.charAt(j)=='e' || str.charAt(j)=='i' || str.charAt(j)=='o' || str.charAt(j)=='u'){
                count++;
            }
            if(j-i==k){
                if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
                    count--;
                }
                i++;
            }
            max = Math.max(count,max);
            j++;
        }
        System.out.println(max);
    }
}
