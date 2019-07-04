package stacks.stackwithmax;

import java.util.Deque;
import java.util.EmptyStackException;

public class StackWithMaxAPI <T extends Comparable<T>> {

  private Deque<ElementWithMax<T>> stack;

  public StackWithMaxAPI(Deque<ElementWithMax<T>> stack) {
    this.stack = stack;
  }

  public void push(T element) {
    if (stack.isEmpty()) {
      stack.push(new ElementWithMax(element, element));
      return;
    }
    stack.push(element.compareTo(
        stack.peek().getMax()) > 0
            ? new ElementWithMax<>(element, element)
            : new ElementWithMax<>(element, stack.peek().getMax())
        );

  }
  public T pop() {
    if (stack.isEmpty()) {
      throw new EmptyStackException();
    }
    return stack.pop().getElement();
  }
  public T max() {
    if (stack.isEmpty()) {
      throw new EmptyStackException();
    }
    return stack.peek().getMax();
  }

}

