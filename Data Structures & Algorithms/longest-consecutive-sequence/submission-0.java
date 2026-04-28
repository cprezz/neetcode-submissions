class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int maxCount =0;
        for(int num : set){
           if(!set.contains(num-1)){
            int pre= num;
              int count =1;

            while(set.contains(pre +1)){
                 pre++;
                count++;
                 
            }
           maxCount = Math.max(maxCount, count);
            
        }
        }
        return maxCount;
        
    }
}
