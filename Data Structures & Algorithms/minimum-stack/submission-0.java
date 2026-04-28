class MinStack {

Stack<Integer> minStack;
Stack<Integer> minstk; 
    public MinStack() {
        minStack = new Stack<Integer>();
        minstk = new Stack<Integer>();
    }
    
    public void push(int val) {
       minStack.push(val);
       minstk.push(minstk.isEmpty() ? minStack.peek() : Math.min(minstk.peek(), minStack.peek()));
    }
    
    public void pop() {
        minStack.pop();
        minstk.pop();
    }
    
    public int top() {
      return  minStack.peek();
        
    }
    
    public int getMin() {
        return minstk.peek();
        
    }
}
