class Solution {
    public int lastStoneWeight(int[] stones) {
         Queue <Integer> pq = new PriorityQueue<>((a, b) -> b-a);
         for(int stone : stones){
            pq.add(stone);
         }

         while(pq.size() > 1){
            int ft = pq.poll();
            int sd = pq.poll();
            int diff = Math.abs(ft - sd);
            if(diff != 0)
             pq.add(diff);
         }

       return pq.size() == 1 ? pq.peek() : 0;
        
    }
}
