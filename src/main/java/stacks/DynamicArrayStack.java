package stacks;

public class DynamicArrayStack {
    private int capacity;
    private int top;
    private int [] stack;

    public DynamicArrayStack() {
        this.capacity = 1;
        top = -1;
        stack = new int[capacity];
    }

    public void push(int element) {

        if (isStackFull()) {
            doubleStack();
        }
        stack[++top] = element;
    }

    private void doubleStack() {
        int [] newArr = new int[capacity*2];

        System.arraycopy(stack, 0, newArr, 0, capacity);
        capacity = capacity * 2;
        stack = newArr;
    }

    private boolean isStackFull() {
        return capacity == (top + 1);
    }

    private boolean isStackEmpty() {
        return top == -1;
    }

    public void deleteStack(){
        top = -1;
    }
    public int pop() {
        if (isStackEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top--];
    }

    public static void main(String[] args) {
        DynamicArrayStack stack = new DynamicArrayStack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
