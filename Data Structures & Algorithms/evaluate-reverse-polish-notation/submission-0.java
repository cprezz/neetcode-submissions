class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        ArrayList<String> op = new ArrayList<>(List.of("+", "-", "*", "/"));
        for(int i= 0;i<tokens.length;i++){
            if(op.contains(tokens[i])){
                String rgt = st.peek();
                st.pop();
                String lft = st.peek();
                st.pop();
                int val=0;

                switch(tokens[i]){
                    case "+" :  val = Integer.parseInt(rgt) + Integer.parseInt(lft);
                    break;

                    case "-" :  val = Integer.parseInt(lft) - Integer.parseInt(rgt);
                    break;

                    case "*" :  val = Integer.parseInt(rgt) * Integer.parseInt(lft);
                    break;

                    case "/" :  val = Integer.parseInt(lft) / Integer.parseInt(rgt);
                    break;
                }
                st.push(String.valueOf(val));

            }
            else {
                st.push(tokens[i]);
            }

        }
        return Integer.parseInt(st.peek());
        
    }
}
