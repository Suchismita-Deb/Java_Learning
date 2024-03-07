package org.example.graph;

import java.util.ArrayList;

public class DfsTraversal {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = 3;
        for(int i=0;i<=v;i++){
            adj.add(new ArrayList<Integer>());
        }

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(1).add(0);
        adj.get(0).add(1);

        for(int i=0;i<=v;i++){
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j));
            }
            System.out.println();
        }

        ArrayList<Integer> ls = new ArrayList<>();
        boolean vis[] = new boolean[v+1];
        vis[0]=true;
        dfs(0,vis,adj,ls);
        System.out.println(ls);
    }
    public static void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls){
        vis[node] = true;
        ls.add(node);

//        System.out.println(node);
        for(Integer it:adj.get(node)){
            if(vis[it]==false)
                dfs(it,vis,adj,ls);
        }
    }
}
