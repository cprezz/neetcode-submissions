class Solution {
    public  boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length())
        return false;
        int fq[] = new int[26];
        Arrays.fill(fq, 0);
        for(int i=0;i<s1.length();i++){
            fq[s1.charAt(i)-'a']++;
        }

        for(int i=0;i<s2.length();i++){
            fq[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(fq[i] !=0)
            return false;
        }

        return true;

       
    }



    public List<List<String>> groupAnagrams(String[] strs) {
        int flag[] = new int[strs.length];
        Arrays.fill(flag, 0);
        List<List<String>>mp = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            List<String> list = new ArrayList<>();
            if(flag[i]==0){
                for(int j = i+1; j< strs.length;j++){
                    if(isAnagram(strs[i], strs[j])){
                        flag[j]=1;
                        list.add(strs[j]);
                    } 
                }
            }
            if(flag[i]==0){
             list.add(strs[i]);
              mp.add(list);
            }
           
        }
        return mp;
        
    }
}
