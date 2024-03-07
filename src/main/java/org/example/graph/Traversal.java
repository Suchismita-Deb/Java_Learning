package org.example.graph;

import java.util.LinkedList;
import java.util.Queue;

public class Traversal {
    public static void main(String[] args) {
        char[][] grid={
                {'1','1','1','0'},
                {'1','1','0','0'},
                {'1','1','0','1'},
                {'1','0','0','0'}
        };
        int n = grid.length;
        int m = grid[0].length;
        int count=0;
        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                if(grid[r][c]=='1'){
                    count++;
                    bfs(grid,r,c);
//                    dfs(grid,r,c);
                }
            }
        }
        System.out.println(count);
//      return count;
    }


    public static void bfs(char[][] grid,int r,int c){
        int n = grid.length;
        int m = grid[0].length;
        if(r<0 || c<0 || grid[r][c] == '0' || r>=n || c>=m){
            return;
        }
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{r,c});
        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            if(curr[0]+1 <n && grid[curr[0]+1][c]=='1' ){
                grid[curr[0]+1][c] = '0';
                queue.offer(new int[]{curr[0]+1,c});
            }
            if(curr[0]-1 >=0  && grid[curr[0]-1][c]=='1' ){
                grid[curr[0]-1][c] = '0';
                queue.offer(new int[]{curr[0]-1,c});
            }
            if(curr[1]+1<m && grid[r][curr[1]+1]=='1' ){
                grid[r][curr[1]+1] ='0';
                queue.offer(new int[]{r,curr[1]+1});
            }
            if(curr[1]-1 >=0 && grid[r][curr[1]-1]=='1' ){
                grid[r][curr[1]-1] ='0';
                queue.offer(new int[]{r,curr[1]-1});
            }
        }
    }

    public static void dfs(char[][] grid,int r, int c){
        int n = grid.length;
        int m = grid[0].length;
        if(r<0 || c<0 || r>=n || c>=m || grid[r][c]=='0'){
            return;
        }
//        count++;
        grid[r][c]='0';
        dfs(grid,r+1,c);
        dfs(grid,r,c+1);
        dfs(grid,r-1,c);
        dfs(grid,r,c-1);
    }

}
