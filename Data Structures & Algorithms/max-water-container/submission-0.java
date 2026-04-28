class Solution {
    public int maxArea(int[] heights) {
        int left=0 , right= heights.length-1;
        int maxWater=0;
        while(left<right){
             int mn = Math.min(heights[left], heights[right]);
           maxWater = Math.max(maxWater, (right - left) * mn);
           if(heights[left] == mn ){
                left+=1;
           } else 
           right-=1;
        }
        return maxWater;
    }
}
