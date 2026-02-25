import java.util.*;

class MyStack {
    Queue<Integer> queue;
    public MyStack() {
        queue = new ArrayDeque<>();  
    }
   
    public void push(int x) {
        queue.offer(x);
        int size = queue.size();
        while (size > 1) {
            queue.offer(queue.poll());
            size--;
        }
    }
   
    public int pop() {
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.poll();
    }
   
    public int top() {
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.peek();
    }
   
    public boolean empty() {
        return queue.isEmpty();
    }
}

public class StackUsingQueue {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
    }
}