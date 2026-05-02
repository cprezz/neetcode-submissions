class TimeMap {
    class Val{
        String value;
        int time;
        
        Val(String  value, int time){
            this.value = value;
            this.time =  time;
        }
    }

     Map<String, List<Val>> timeMap;

    public TimeMap() {
        timeMap = new HashMap<>();
        
    }
    
    public void set(String key, String value, int timestamp) {
        List<Val> values;
        if(timeMap.containsKey(key)){
            values = timeMap.get(key);
        }
        else 
        values = new ArrayList<>();
    
        values.add(new Val(value, timestamp));

        timeMap.put(key, values);
        // System.out.println(timeMap.size());
        
    }
    
    public String get(String key, int timestamp) {
        List<Val> values;
        if(timeMap.containsKey(key)){
            values = timeMap.get(key);
        }
        else
         values = new ArrayList<>();

        //  System.out.println(values.size());
    

        int start =0, end= values.size()-1;
        int prev_time=0;
        String prev_value = "";

        while(start <= end){
            int mid = start + (end - start)/2;
            Val currValue = values.get(mid);

             System.out.println(currValue.value);
            
            if(currValue.time == timestamp)
            return  currValue.value;
            else if(currValue.time < timestamp){
                prev_time = currValue.time;
                prev_value = currValue.value;
                start= mid+1;

            }
            else {
                end = mid-1;
            }

        }
         return prev_value;
        
    }
}
