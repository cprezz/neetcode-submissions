class Solution {
    public class valVsKey{
        int key;
        int val;
          public valVsKey(int key, int val){
            this.key=key;
            this.val = val;
          }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int num : nums){
            mp.put(num, mp.getOrDefault(num, 0)+1);
        }

        List<valVsKey> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            list.add(new valVsKey(entry.getKey(), entry.getValue()));
        }

   Collections.sort(list, (a, b)-> b.val -a.val);
   int res[] = new int[k];
   for(int i=0;i<k;i++){
    res[i] = list.get(i).key;
   }

   return res;
        
    }
}
