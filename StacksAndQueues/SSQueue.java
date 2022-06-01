
public class SSQueue {

    private MyStack newOnTop;
    private MyStack oldOnTop;

    public SSQueue(int size) {
        newOnTop = new MyStack(size);
        oldOnTop = new MyStack(size);
    }

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