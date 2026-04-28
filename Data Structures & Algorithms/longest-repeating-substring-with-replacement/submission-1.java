class Solution {
    public int characterReplacement(String s, int k) {
        int hash[] = new int[26];
        Arrays.fill(hash, 0);

        int left=0, right=0, maxLen=0, maxf=0;
        while(right< s.length()){
            hash[s.charAt(right)-'A']++;
            maxf = Math.max(maxf, hash[s.charAt(right)-'A']);
            while(((right -left +1) -maxf )> k){
             hash[s.charAt(left)-'A']--;
             left++;
            }
            maxLen = Math.max(maxLen, (right - left +1) );
            right++;
        }
         return maxLen;  
    }
}
