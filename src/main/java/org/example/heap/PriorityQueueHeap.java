package org.example.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] rank = {22,11,12,8,3};
        for(int i=0;i<rank.length;i++){
            pq.add(rank[i]);
        }
        while(pq.size()>0){
            System.out.print(pq.peek()+" ");
            pq.remove();
        }


        System.out.println();
        PriorityQueue<Integer> pqRev = new PriorityQueue<>(Collections.reverseOrder());
        int[] score = {89,98,88,99,89};
        for(int i=0;i<score.length;i++){
            pqRev.add(score[i]);
        }
        while(pqRev.size()>0){
            System.out.print(pqRev.peek()+" ");
            pqRev.remove();
        }
    }
}
