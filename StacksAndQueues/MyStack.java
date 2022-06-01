import java.util.NoSuchElementException;

public class MyStack {
    private int top;
    private int[] content;
    
    public MyStack(int size) {
        top = 0;
        content = new int[size];
    }

    public int pop() {
        if(top == 0){
            throw new NoSuchElementException();
        }
        return content[--top];
    }

    public boolean push(int val) {
        if(top == content.length) {
            return false;
        }
        content[top++] = val;
        return true;
    }

    public int peek() {
        if(top == 0) {
            throw new NoSuchElementException();
        }
        return content[top];
    }

    public int size() {
        return content.length;
    }

    public boolean isEmpty() {
        return top == 0;
    }
}
