package org.example.DailyDrill.arrayList;
import java.util.*;
import java.util.function.Consumer;

public class arrayList1 {

    public static void swapPair(ArrayList<String> arr)
    {
        List<String> res = new ArrayList<>();
        for(int i=0;i<arr.size()-1;i+=2)
        {
            String a=arr.get(i); // For getting element from the position.
            String b=arr.get(i+1);
            res.add(b);
            res.add(a);
        }
        System.out.println(res);
    }

    public static void removeEvenLength(ArrayList<String> list) {
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).length()%2!=0)
                arr.add(list.get(i));
        }
        System.out.println(arr);

    }

    public static void removeDuplicates(ArrayList<String> list) {
        ArrayList<String> arr = new ArrayList<>();
        if(list.size()==0)
        {
            System.out.println(list);
            return;
        }

        for(int i=0;i<list.size()-1;i++)
        {
            if(!list.get(i).equals(list.get(i+1)))
                arr.add(list.get(i));
        }
        arr.add(list.get(list.size()-1));

        // This is important as when the last element id unique and
        // not same with the previous one then we are not adding the last one.
        // We can directly add the last one as the if condition will only add when the next element is different.

        System.out.println(arr);
    }

    public static void removeInRange(ArrayList<Integer> list, int value, int min, int max) {
        ArrayList<Integer> arr = new ArrayList<>();
        if(max<min)
        {
            System.out.println(list);
            return;
        }
        for(int i=0;i<min;i++)
            arr.add(list.get(i));
        for(int i=min;i<max;i++)
        {
            if(list.get(i)!=value)
                arr.add(list.get(i));
        }
        for(int i=max;i<list.size();i++)
            arr.add(list.get(i));
        System.out.println(arr);
    }
    public static void main(String[] args) {
        //Practice It Platform. ArrayList Problems.

        ArrayList<String> arr = new ArrayList<>();
        arr.add("RED");
        arr.add("GREEN");
        arr.add("BLUE");
        arr.add("YELLOW");
        arr.add("PINK");
        arr.add("PURPLE");
        System.out.println(arr);
        swapPair(arr);


        //Printing individual element at one index.
        System.out.println(arr.get(5));
        //Getting each element size in the list.
        System.out.println(arr.get(5).length()); // Individual element is string.


        //Adding multiple elements in arrayList
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("a", "b"));
        ArrayList<String> arrayList1 = new ArrayList<>(List.of("a", "b"));

        ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList("a", "b"));
        Collections.addAll(arrayList2, "c", "d");
        System.out.println(arrayList2);

        List<String> namesList = Arrays.asList( "a", "b", "c");
        ArrayList<String> instance = new ArrayList<>(namesList);

        //removing even length element in the list.
        removeEvenLength(arr);

        ArrayList<Integer> alist = new ArrayList<>(Arrays.asList(78,89,98,789,89,989,98));
        System.out.println(alist);
        Collections.sort(alist);//Sort in place.
        System.out.println(alist);

        //remove duplicates.
        ArrayList<String>list = new ArrayList<>(Arrays.asList("be", "be", "is", "not", "or", "question", "that", "the", "to", "to"));
        removeDuplicates(list);

        //remove the occurrence of value in the range of min(inclusive) and max(exclusive).
        ArrayList<Integer> arrayList3 = new ArrayList<>(Arrays.asList(2,8,4,4325,565,6,9,8,9,9,0,54,3,2,0,89,98));
        removeInRange(arrayList3,0,11,16);
        List<Integer> list123 = Arrays.asList(1,4,6,8,9,7,5,3,2);

//Implemenation via anonymous inner class
        list123.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        });
    }
}
