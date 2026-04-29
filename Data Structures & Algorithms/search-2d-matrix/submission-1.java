class Solution {
    int findRow(int[][] matrix, int start , int end, int target){
         if(start > end) return -1;
         int mid =  start + (end - start)/2;

        if(mid < 0 || mid >= matrix.length)
        return -1;
        // System.out.println("row is :" + mid);



        if(matrix[mid][0] > target)
        return findRow(matrix, start, mid-1, target);
        else if(matrix[mid][matrix[0].length-1] < target)
        return findRow(matrix, mid+1, end, target);
        else
        return mid;

    }

boolean findNum(int[][] matrix, int start,int end, int target, int row ){
     if(start > end) return false;
        int mid = start + (end - start)/2;
        if(mid < 0 || mid >= matrix[row].length)
        return false;

        if(matrix[row][mid] == target)
        return true;
        else if(matrix[row][mid] < target)
        return findNum(matrix, mid+1, end, target, row);
        else
        return findNum( matrix, start, mid-1,target, row);

    }
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length;
        int n= matrix[0].length;

          int row = findRow(matrix, 0, m-1, target);
        //   System.out.print("row is :" + row);
          if(row==-1)
          return false;

         return findNum(matrix, 0, n-1, target, row); 
    }
}
