package lrucache;

import java.util.HashMap;
import java.util.Map;

class LruCache {
    private Map<Integer, Node> cache = new HashMap<>();
    private int capacity;
    private Node start, end;
    private class Node {
        int key;
        int value;
        Node previous;
        Node next;
    };

    private void addToStart(Node node) {
        //System.out.println("Adding to the start " + node.key);
        node.next = start;
        node.previous = null;
        if (start != null) {
            start.previous = node;
        }
        start = node;
        if (end == null) end = start;

    }

    private void removeNode(Node node) {
        //System.out.println("removing key " + node.key);
        if (node.previous != null) {
            node.previous.next = node.next;
        } else {
            start = node.next;
        }
        if (node.next != null) {
            node.next.previous = node.previous;
        } else {
            end = node.previous;
        }


    }
    public LruCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) return -1;
        removeNode(cache.get(key));
        addToStart(cache.get(key));
        return cache.get(key).value;
    }



    public void put(int key, int value) {
        //System.out.printf("inserting key %d value %d ", key, value);
        //System.out.println();
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;
            removeNode(node);
            addToStart(node);
            return;
        }
        //check for size
        if (this.capacity == cache.size()) {
            //System.out.println("Size is over " + this.capacity);
            //remove LRU node
            cache.remove(end.key);
            removeNode(end);




        }
        //addToStart
        Node newNode = new Node();
        newNode.key = key;
        newNode.value = value;

        addToStart(newNode);
        cache.put(key, newNode);

    }

}

