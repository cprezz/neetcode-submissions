class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        left[0] = 1;
        right[nums.length-1] = 1;

        for(int i=1;i<nums.length;i++){
         left[i] = left[i-1] * nums[i-1];
         right[n -1 -i] =  right[n-i] * nums[n-i];
        }
        
        // for(int num : right){
        //     System.out.print( num + " ");
        // }
         int res[] = new int[n];
         for(int i=0;i<n;i++){
            res[i] = left[i] * right[i];
         }
         return res;
    }
}  
