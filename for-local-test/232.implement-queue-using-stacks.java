import java.util.Stack;

class MyQueue {
    private Stack<Integer> stackIn;
    private Stack<Integer> stackOut;

    public MyQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }
    
    public void push(int x) {
        stackIn.push(x);
    }
    
    public int pop() {
        peek();
        return stackOut.pop();
    }
    
    public int peek() {
        if(stackOut.isEmpty()){
            while(!stackIn.isEmpty()){
                stackOut.push(stackIn.pop());
            }
        }
        return stackOut.peek();
    }
    
    public boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        System.out.println(obj.peek()); // returns 1
        System.out.println(obj.pop());  // returns 1
        System.out.println(obj.empty()); // returns false
    }
}


