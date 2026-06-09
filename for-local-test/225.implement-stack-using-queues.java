import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> q = new LinkedList<>();

    public MyStack() {

    }
    
    public void push(int x) {
        q.add(x);
        for (int i = 0; i < q.size() - 1; i++){
            q.add(q.remove());
        }
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top()); // returns 2
        System.out.println(stack.pop()); // returns 2
        System.out.println(stack.empty()); // returns false
    }
}


