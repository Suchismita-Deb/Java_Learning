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

    private int getBucketIndex(K key){
        // Every object in java is from Object class.
        // Using the hashcode and the compression to get the position inside the array.
        int hashCode = key.hashCode();
        return hashCode%capacity;
    }

     public V get(K key){
         // Return the value of the key. No key present then return null.
         // Finding the index of the bucket array where the key resides. We can find using hash function.
         int bucketIndex = getBucketIndex(key);
         // getBucketIndex is a hash function and contains two parts getting the hashcode and compression in order to make within the array size.
         MapNode<K,V> head = bucket.get(bucketIndex);
         while(head!=null){
             if(head.key.equals(key))
                 return head.value;
             head = head.next;
         }
         return null;
    }
    public void put(K key, V value){
        // if key already present then will update with the new value.
        int bucketIndex = getBucketIndex(key);
        MapNode<K,V> head = bucket.get(bucketIndex);
        while(head!=null){
            if(head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        // Make a new node and add the value.
        // We can add at the end. Here we are adding in the beginning.
        MapNode<K,V> entry = new MapNode<>(key,value);
        head = bucket.get(bucketIndex);
        entry.next = head;
        bucket.set(bucketIndex,entry);
    }

    public void remove(K key){
        int bucketIndex = getBucketIndex(key);
        MapNode<K,V> head = bucket.get(bucketIndex);
        MapNode<K,V> prev = null;
        while(head!=null){
            if(head.key.equals(key)) {
                if(prev==null){
                    bucket.set(bucketIndex,head.next);
                }
                else{
                    prev.next = head.next;
                }
                head.next=null;
                size--;
                return;
            }
            prev = head;
            head = head.next;
        }
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
