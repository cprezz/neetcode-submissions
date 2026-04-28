class Solution {
    public boolean checkInclusion(String s1, String s2) {
    int s1Len = s1.length();
    int s2Len = s2.length();

    if(s2Len < s1Len)
    return false;
    int hash[] = new int[26];
    int mp[] = new int[26];

    for( int i=0;i< s1Len;i++){
        hash[s2.charAt(i) -'a']++;
        mp[s1.charAt(i)-'a']++;
    }
   
    if(hash.equals(mp)){
            return true;
         } 

     int left =0;
     int right= s1Len;

     while( right < s2Len){
        if(Arrays.equals(hash, mp)){
            return true;
         } 
         hash[s2.charAt(right++)-'a']++;
         hash[s2.charAt(left++)-'a']--;
     }

return Arrays.equals(hash, mp);
    }
    
}
