class MinStack {
     long minEle;
      Stack<Long>s =new Stack<>();

    
    public void push(int val) {
        if(s.isEmpty()){s.push((long)val);minEle=val;}
        else if(val<minEle){s.push(2L*val-minEle);minEle=val;}
        else s.push((long)val);
    }
    
    public void pop() {
        long t=s.pop();
        if(t<minEle) minEle=2*minEle-t;
    }
    
    public int top() {
        long t =s.peek();
        return t<minEle?(int)minEle:(int)t;
    }
    
    public int getMin() {
        return (int)minEle;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */