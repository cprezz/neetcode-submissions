class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        
        // Key: Sorted string, Value: List of anagrams
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            // 1. Create a signature by sorting the string
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedKey = String.valueOf(chars);
            
            // 2. Put it into the map
            if (!map.containsKey(sortedKey)) {
                map.put(sortedKey, new ArrayList<>());
            }
            map.get(sortedKey).add(s);
        }
        
        // Return only the values (the sublists)
        return new ArrayList<>(map.values());
    }
}