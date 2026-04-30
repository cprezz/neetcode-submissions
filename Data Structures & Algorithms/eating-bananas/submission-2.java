class Solution {
    int getTime(int[] piles, int count){
        int sum =0;
        for(int pile : piles){
            sum+= ( (pile/ count) + (pile%count!= 0 ? 1: 0));
        }
         return sum;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int mx=0;
        int minTime =h;
     for(int pile : piles){
        mx= Math.max(mx, pile);
     }


     int start=1, end = mx;
     while(start < end){
        int mid = start + (end-start)/2;
        int timeNeed = getTime(piles, mid);
        System.out.println( "for : " + mid + " time needed is : " + timeNeed);
        if(timeNeed > h){
            start = mid+1;
        } else if(timeNeed <= h){
            mx=mid;
            end= mid;
        }
     }
     return mx;
        
    }
}
