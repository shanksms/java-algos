package stacks;

import lombok.AllArgsConstructor;


public class ArrayStack {
    private int top;
    private int [] stack;
    private int capacity;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.top = -1;
        stack = new int[capacity];
    }


    public void push(int element) {
        if (isStackFull()) {
            throw new StackFullException();
        }
        stack[++top] = element;

    }

    public int pop() {
        if (isStackEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top--];
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

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
