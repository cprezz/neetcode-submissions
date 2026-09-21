class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
       Queue<int[]> q = new LinkedList<>();
       for(int i =0;i < m ; i++){
        for(int j=0;j<n;j++){
            if(grid[i][j]==0)
            q.add(new int[]{i,j});
        }
       } 

       int[] x= {-1,0,1,0};
       int[] y= {0,-1, 0, 1};

        while(!q.isEmpty()){
            int []curr = q.poll();
            for(int k=0;k<4;k++){
                int xi = curr[0] + x[k];
                int yj = curr[1] + y[k];
                if( !isValid(xi, yj, m ,n) ||  grid[xi][yj] !=Integer.MAX_VALUE ){
                     continue;

                }

                     grid[xi][yj] =grid[curr[0]][curr[1]] + 1;
                     q.add(new int[]{xi, yj});
            }
        }
        
    }
     boolean isValid( int i ,int j, int m , int n){
        return i>=0 && i<m && j>=0 && j< n;
     }
}
