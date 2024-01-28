package org.example.map.DesignHashMap;

public class ImplementMap {
    public static void main(String[] args) {
        MyMap<Integer,String> nameMap = new MyMap<>();
        nameMap.put(1,"Hello");
        nameMap.put(2,"Java");
        nameMap.put(3,"Spring");
        nameMap.put(4,"Javascript");
        nameMap.put(5,"React");
        nameMap.put(1,"DSA");

//        System.out.println(nameMap.get(3));
//        System.out.println(nameMap.get(1));
    }
}
