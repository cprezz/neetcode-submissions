class Solution {
     int m , n;
    public void solve(char[][] board) {
     Stack<int[]> st= new Stack<>();
       m= board.length;
       n= board[0].length;

       for(int i=0;i<n;i++){
        if(board[0][i]=='O')
        st.add( new int[]{0,i});
       }
        for(int i=0;i<m;i++){
        if(board[i][0]=='O')
        st.add( new int[]{i,0});
       }
        for(int i=0;i<n;i++){
        if(board[m-1][i]=='O')
        st.add( new int[]{m-1,i});
       }
        for(int i=0;i<m;i++){
        if(board[i][n-1]=='O')
        st.add( new int[]{i,n-1});
       }
        
        while(!st.isEmpty()){
            int[] node = st.pop();
             int row = node[0];
             int col = node[1];
            if(board[row][col] =='O'){
                dfs(board, row, col);
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j] =='O'){
                    board[i][j] = 'X';
                } else if(board[i][j] == 'F'){
                    board[i][j] ='O';
                }
            }
        }
    }
     int[] xDir = {-1, 0, 1, 0};
     int[] yDir = {0, 1,0, -1};
     void dfs(char[][] board, int i, int j){
        if(board[i][j]!='O'){
            return;
        }
         board[i][j] = 'F';

        for(int k =0;k<4;k++) {
             int row = i + xDir[k];
             int col = j + yDir[k];
            if(row < 0 || col < 0 || row >=m || col >=n || board[row][col] !='O'){
                continue;
            }

            dfs(board, row, col);

        }
     }
}
