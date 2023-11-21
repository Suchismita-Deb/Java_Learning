package org.example.DailyDrill.arrayList;
import java.util.*;

public class arrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1,4,56,7,8));
        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(23,24,5453,3435));
        ArrayList<Integer> arr = new ArrayList<>();
        int a=a1.size();
        int b=a2.size();
        int c=Math.min(a,b);
        for(int i=0;i<c;i++)
        {
            arr.add(a1.get(i));
            arr.add(a2.get(i));
        }
        if(a<b)
        {
            for(int i=c;i<b;i++)
                arr.add(a2.get(i));
        }
        else if(b<a)
        {
            for(int i=c;i<a;i++)
                arr.add(a1.get(i));
        }
        System.out.println(arr);
    }
}
