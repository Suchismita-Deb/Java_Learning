package linkedList;

import java.util.*;
public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("HELLO");
        ll.add("HII");
        ll.add("WORLD");
        System.out.println(ll);

        for(String str:ll)
            System.out.print(str+" ");
    }
}
