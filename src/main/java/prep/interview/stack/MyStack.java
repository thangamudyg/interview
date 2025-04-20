package prep.interview.stack;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    static Queue<Integer> queue = new LinkedList<>();

    void push(int x) {
        queue.add(x);
        for (int i = 1; i < queue.size(); i++) {
            queue.add(queue.remove());
        }
    }

    Integer peek() {
        if (queue.isEmpty()) {
            return -1;
        }
        Integer value = queue.peek();
        queue.remove();
        return value;
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack.peek());
        System.out.println(myStack.peek());
        System.out.println(myStack.peek());
    }
}

