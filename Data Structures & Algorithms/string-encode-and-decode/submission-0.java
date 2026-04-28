class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        for(int i=0;i<strs.size();i++){
            s.append(strs.get(i).length()).append("#").append(strs.get(i));
        }
        return s.toString();

    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();

        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j +1;
            String s1 = str.substring(i,i+length);
            i  = i + length;
            res.add(s1);
        }
        return res;

    }
}
