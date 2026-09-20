class Solution {
      static int[] x = {-1,0, 1,0};
      static int[] y = {0, 1,0,-1};
     int m, n;
     int count;
     public int maxAreaOfIsland(int[][] grid) {
      
       m = grid.length;
       n = grid[0].length;
        int res=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n; j++){
                if(grid[i][j] ==1){
                     count =0;
                     dfs(grid, i, j);
                   res = Math.max( res , count );
                }
            }
        } 
         return res;
        
    }

     void dfs( int[][] grid, int i, int j){
        if(grid[i][j] ==1){
             count++;
            grid[i][j] = 0;
            for(int k=0;k<4;k++){
                if(isValid(i+x[k], j+ y[k])){
                    dfs( grid, i+x[k], j+ y[k]);
                }
            }
        }

     }
      boolean isValid(int i, int j){
        return  (i>=0 && i< m) && (j >=0 &&  j< n);
      }
}
