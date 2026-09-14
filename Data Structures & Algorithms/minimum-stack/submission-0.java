class MinStack {
    Stack<int[]> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()) {
            stack.push(new int[]{val, val});
        } else {
            int prevMin = stack.peek()[1];
            int currentMin = Math.min(val, prevMin);

            stack.push(new int[]{val, currentMin});
        }
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek()[0];
    }
    
    public int getMin() {
        return stack.peek()[1];
    }
}
