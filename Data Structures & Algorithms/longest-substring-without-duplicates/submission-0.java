class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> hash = new HashMap<>();
         int maxLen =0;
         int left =0;
         for( int right =0;right < s.length();right++){
            if(hash.containsKey(s.charAt(right))){
                while(s.charAt(left) != s.charAt(right)){
                    hash.remove(s.charAt(left));
                    left++;
                }
                hash.remove(s.charAt(left));
                    left++;
            } else {
                maxLen = Math.max(maxLen, right - left + 1);
            }
             hash.put(s.charAt(right), 1);
         }
          return maxLen;
        
    }
}
