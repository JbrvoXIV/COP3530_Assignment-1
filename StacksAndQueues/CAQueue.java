import java.util.NoSuchElementException;

public class CAQueue {

    private int[] queue;
    private int front, rear;

    public CAQueue(int size) {
        queue = new int[size];
        front = rear = -1;
    }

    public boolean isFull() {
        return front == (rear + 1) % queue.length;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enqueue(int data) {
        if(isFull()) {
            throw new IllegalStateException();
        }
        if(isEmpty()) {
            front++;
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = data;
    }

    public int dequeue() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }

        int removedData = queue[front];
        if(front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % queue.length;
        }
        return removedData;
    }

    public void resize() {
        int[] temp = new int[queue.length * 2];
        int i = 0;
        int j = front;

        do {
            temp[i++] = queue[front];
            j = (j + 1) % queue.length;
        } while(j != front);

        front = 0;
        rear = temp.length - 1;
        queue = temp;
    }
}