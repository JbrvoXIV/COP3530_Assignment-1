import java.util.Stack;

public class SSQueue {

    private Stack<Integer> newOnTop = new Stack<>();
    private Stack<Integer> oldOnTop = new Stack<>();

    public void enqueue(int data) {
        newOnTop.push(data);
    }

    public int dequeue() {
        if(oldOnTop.isEmpty()) {
            while(!newOnTop.isEmpty()) {
                oldOnTop.push(newOnTop.pop());
            }
        }
        return oldOnTop.pop();
    }

    public boolean isEmpty() {
        return newOnTop.isEmpty() && oldOnTop.isEmpty();
    }

    public int getLength() {
        return newOnTop.size() + oldOnTop.size();
    }
}