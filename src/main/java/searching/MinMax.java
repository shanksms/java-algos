package searching;

/**
 * Find min max from an array efficiently
 */
public class MinMax {
  public static class MinMaxObject {
    int min;
    int max;

    public MinMaxObject(int min, int max) {
      this.min = min;
      this.max = max;
    }

    public int getMin() {
      return min;
    }

    public void setMin(int min) {
      this.min = min;
    }

    public int getMax() {
      return max;
    }

    public void setMax(int max) {
      this.max = max;
    }
  }

  public MinMaxObject findMinMax(int [] elements) {
    int len = elements.length;

    if (len == 0) return null;
    if (len == 1) return minMax(elements[0], elements[0]);

    MinMaxObject globalMinMax = minMax(elements[0], elements[1]);

    for (int i = 2; i < len - 1; i += 2 ) {
      MinMaxObject localMinMax = minMax(elements[i], elements[i + 1]);
      int min = Math.min(localMinMax.min, globalMinMax.min);
      int max = Math.max(localMinMax.max, globalMinMax.max);
      globalMinMax = new MinMaxObject(min, max);
    }
    return globalMinMax;
  }

  private MinMaxObject minMax(int e1, int e2) {
    return e1 > e2 ? new MinMaxObject(e2, e1) : new MinMaxObject(e1, e2);

  }

}


