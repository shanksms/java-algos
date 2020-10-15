package coursera.algorithms.algorithm;

import java.util.*;
import java.io.*;

public class StackWithMax {
    class FastScanner {
        StringTokenizer tok = new StringTokenizer("");
        BufferedReader in;

        FastScanner() {
            in = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (!tok.hasMoreElements())
                tok = new StringTokenizer(in.readLine());
            return tok.nextToken();
        }
        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }

    class StackNew {
        Stack<Integer> stack;
        Stack<Integer> maxStack;

        public StackNew() {
            this.stack = new Stack<>();
            this.maxStack = new Stack<>();
        }

        public Integer push(Integer value) {
            if (maxStack.isEmpty() || maxStack.peek() <= value) {
                maxStack.push(value);
            }
            return stack.push(value);
        }

        public Integer pop() {
            if (stack.peek() == maxStack.peek()) {
                maxStack.pop();
            }
            return stack.pop();
        }

        public Integer max() {
            return maxStack.peek();
        }


    }

    public void solve() throws IOException {
        FastScanner scanner = new FastScanner();
        int queries = scanner.nextInt();
        StackNew stack = new StackNew();

        for (int qi = 0; qi < queries; ++qi) {
            String operation = scanner.next();
            if ("push".equals(operation)) {
                int value = scanner.nextInt();
                stack.push(value);
            } else if ("pop".equals(operation)) {
                stack.pop();
            } else if ("max".equals(operation)) {
                System.out.println(stack.max());
            }
        }
    }

    static public void main(String[] args) throws IOException {
        new StackWithMax().solve();
    }
}
