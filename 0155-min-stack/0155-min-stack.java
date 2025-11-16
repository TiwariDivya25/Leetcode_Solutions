class MinStack {

    private Node head;

    public MinStack() {
        
    }
    
    public void push(int val) {
        if (head == null) {
            head = new Node(val, val, null);
        } else {
            int min = Math.min(val, head.min);
            Node newNode = new Node(val, min, head);
            head = newNode;
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.data;
    }
    
    public int getMin() {
        return head.min;
    }

    private class Node {
        int data;
        int min;
        Node next;

        Node (int data, int min, Node next) {
            this.data = data;
            this.min = min;
            this.next = next;
        }
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