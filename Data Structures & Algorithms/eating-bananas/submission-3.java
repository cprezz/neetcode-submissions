class Solution {
    long getTime(int[] piles, int count){
        long sum =0;
        for(int pile : piles){
            sum+= ( (pile/ count) + (pile%count!= 0 ? 1: 0));
        }
         return sum;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int mx=0;
     for(int pile : piles){
        mx= Math.max(mx, pile);
     }


     int start=1, end = mx;
     int ans= mx;
     while(start < end){
        int mid = start + (end-start)/2;
        long timeNeed = getTime(piles, mid);
        if(timeNeed > h){
            start = mid+1;
        } else if(timeNeed <= h){
            ans=mid;
            end= mid;
        }
     }
     return ans;
        
    }
}
