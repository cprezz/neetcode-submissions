class Solution {
    private boolean isRowValid(char[][] board){
        for(int i=0;i<9;i++){
            Set<Character> set = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j] !='.'){
                    if(set.contains(board[i][j]))
                    return false;
                    else 
                    set.add(board[i][j]);
                }
            }
        }
        return true;
    }

     private boolean isColValid(char[][] board){
        for(int i=0;i<9;i++){
            Set<Character> set = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i] !='.'){
                    if(set.contains(board[j][i]))
                    return false;
                    else 
                    set.add(board[j][i]);
                }
            }
        }
        return true;
    }

    private boolean isSquareValid(char[][] board){
        for(int k=0;k<9;k++){
            Set<Character> set = new HashSet<>();
           for(int i=0;i<3;i++){
            for(int j =0;j<3;j++){
                int row = ( k/3)*3 + i;
                int col = ( k%3)*3 + j;
                 if(board[row][col] !='.'){
                    if(set.contains(board[row][col]))
                    return false;
                    else 
                    set.add(board[row][col]);
                }
            }
           }
        }
        return true;
    }
    
    
    public boolean isValidSudoku(char[][] board) {
        return isRowValid(board) && isColValid(board) && isSquareValid(board);
    }
    
}
