package org.example.graph;

public class countVertex {
    private static int count=0;
    public static void main(String[] args) {
        char[][] grid={
                {'1','1','1','0'},
                {'1','1','0','0'},
                {'1','1','0','1'},
                {'1','0','0','0'}
        };
        int n = grid.length;
        int m = grid[0].length;

        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                if(grid[r][c]=='1'){
//                    count++;
                    dfs(grid,r,c);
                }
            }
        }
        System.out.println(count);
    }
    public static void dfs(char[][] grid,int r, int c){
        int n = grid.length;
        int m = grid[0].length;
        if(r<0 || c<0 || r>=n || c>=m || grid[r][c]=='0'){
            return;
        }
        count++;
        grid[r][c]='0';
        dfs(grid,r+1,c);
        dfs(grid,r,c+1);
        dfs(grid,r-1,c);
        dfs(grid,r,c-1);
    }
}
