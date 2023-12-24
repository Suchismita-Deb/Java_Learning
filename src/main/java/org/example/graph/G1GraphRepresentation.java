package org.example.graph;

import java.util.ArrayList;

public class G1GraphRepresentation {
    public static void main(String[] args) {
        ArrayList<ArrayList> adj = new ArrayList<>();
        int v = 3;
        // Now the ArrayList is created by making null value in it.
        // We cannot add value if the list is null. We can add value when the list is empty. We will create empty list.
        // 1 based index so we will start from 0 and go till n to get the last index.
        for(int i=0;i<=v;i++){
            adj.add(new ArrayList<Integer>());
        }

        // 1---2 There is an edge between 1 and 2.
        // 1 is connected to 2 and it is undirected so will update the 1 list with 2 and 2nd list with 1.
        adj.get(1).add(2);
        adj.get(2).add(1);
        // 2---3
        // For directed graph like if the connection is like 2--->3 then will only add 3 to the list 2 and not 2 to the list of 3.
        adj.get(2).add(3);
        adj.get(3).add(2);
        // 1---3
        adj.get(1).add(3);
        adj.get(3).add(1);

        for(int i=0;i<=v;i++){
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j));
            }
            System.out.println();
        }
    }
}
