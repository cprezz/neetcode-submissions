class Solution {
    void get2Sum(int[] nums, int start, int target, int firstVal, Set<List<Integer>> res){
        int i=start, j = nums.length-1;
        while(i < j){
            int sum = nums[i] + nums[j];
            if(sum == target) {
                res.add(List.of(firstVal, nums[i], nums[j]));
                i++;
                j--;
            } else if(sum > target)
                j-=1;
            else 
                i+=1;
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res= new HashSet<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length-2; i++){
            get2Sum(nums, i+1, nums[i]*(-1), nums[i], res);
        }

        return res.stream().toList();
    }
}