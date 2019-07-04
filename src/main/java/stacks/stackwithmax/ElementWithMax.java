package stacks.stackwithmax;

import lombok.Value;

@Value
public class ElementWithMax <T extends Comparable<T>> {

  private T element;
  private T max;
}
