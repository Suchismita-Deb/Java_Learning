package org.example.map.DesignHashMap;

import java.util.ArrayList;
import java.util.List;

public class MyMap<K,V>{
    // <K,V> means there are two generic type will be passed in the map.
    // Map had key and value.
    // Map is like the bucket array. It is the list of list.
    private List<MapNode<K,V>> bucket;

    // Singly Linked List.
    private int capacity; // length of the bucket.
    private int size; // number oif entries in the map.
    private final int INITIAL_CAPACITY=5;// initial length of the buckert array.

    // constructor for the MyMap.
    public MyMap(){
        bucket = new ArrayList<>();
        capacity = INITIAL_CAPACITY;
        for(int i=0;i<INITIAL_CAPACITY;i++)
            bucket.add(null);
        // When we make list the list size will be zero. Its size only change when we add value to the list.
        // When we create a list we need to put some value to the list in order to get the position.
    }

    public V get(K key){
        // return the value from the key we get. // No key present then return null.

    }
    public void put(K key, V value){
        // if key already present then will update with the new value.
    }

    public void remove(K key){

    }
    private class MapNode<K,V>{
        // MapNode is the head of the linkedlist.
        K key;
        V value;
        MapNode<K,V> next;

        public MapNode(K key,V value){
            this.key = key;
            this.value = value;
        }
    }

}
