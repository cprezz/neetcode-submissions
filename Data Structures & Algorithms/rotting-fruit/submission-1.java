class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n= grid[0].length;
        Queue<int[]> q= new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] ==2){
                    q.add( new int[]{i,j});
                }
            }
        }

        int[] xDir= {-1,0,1,0};
        int[] yDir = {0,-1,0,1};


         while(!q.isEmpty()){
            int[] curr = q.poll();
             for(int k=0;k<4;k++){
                int x = curr[0] + xDir[k];
                int y = curr[1] + yDir[k];
                if( x >=m|| y>=n || x<0 || y < 0 || grid[x][y] !=1){
                    continue;
                } 

                grid[x][y] = grid[curr[0]][curr[1]]+1;
                q.add(new int[]{x,y});
             }

         }

         int max =2;
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] ==1)
                return -1;

                max = Math.max( max, grid[i][j]);
            }
         }
          return max-2;
    }
}
