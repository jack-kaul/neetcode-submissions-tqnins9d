class MyStack {

    int elements;
    Queue<Integer> q1, q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
        elements = 0;
    }
    
    public void push(int x) {
        if(q1.size() == 0) {
            q2.offer(x);
        } else {
            q1.offer(x);
        }
        elements++;
    }
    
    public int pop() {
        if(q1.size() != 0) {
            int shift = --elements;
            while(shift > 0) {
                q2.offer(q1.poll());
                shift--;
            }
            return q1.poll();
        } else {
            int shift = --elements;
            while(shift > 0) {
                q1.offer(q2.poll());
                shift--;
            }
            return q2.poll();
        }
    }
    
    public int top() {
        int top = pop();
        if(q1.size() != 0) {
            q1.offer(top);
        } else {
            q2.offer(top);
        }
        elements++;
        return top;
    }
    
    public boolean empty() {
        if(q1.isEmpty() && q2.isEmpty()) {
            return true;
        }
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */