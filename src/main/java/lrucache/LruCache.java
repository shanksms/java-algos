package lrucache;

import java.util.HashMap;
import java.util.Map;

public class LruCache {
    private Map<String, Node> cache = new HashMap<>();
    private int maxSize;
    private Node start, end = null;

    public LruCache(int maxSize) {
        this.maxSize = maxSize;
    }

    public void put(String key, String val) {
        //check for size
        if (maxSize == cache.size()) {
            //remove LRU node
            if (end != null) {
                removeNode(cache.get(key));
                cache.remove(end.key);

            }
        }
        //addToStart
        Node newNode = new Node();
        newNode.key = key;
        newNode.value = val;

        addToStart(newNode);
        cache.put(key, newNode);

    }

    public String get(String key) {
        if (cache.get(key) == null) return null;

        addToStart(cache.get(key));
        return cache.get(key).value;

    }

    private void addToStart(Node node) {
        node.next = start;
        node.previous = null;
        if (start != null) {
            start.previous = node;
        }
        start = node;
        if (end == null) end = start;


    }

    private void removeNode(Node node) {
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


}

class Node {
    String key;
    String value;
    Node previous;
    Node next;
}
