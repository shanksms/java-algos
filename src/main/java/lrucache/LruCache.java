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
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = val;
            removeNode(node);
            addToStart(node);
            return;
        }
        //check for size
        if (maxSize == cache.size()) {
            //remove LRU node

                removeNode(end);
                cache.remove(end.key);


        }
        //addToStart
        Node newNode = new Node();
        newNode.key = key;
        newNode.value = val;

        addToStart(newNode);
        cache.put(key, newNode);

    }

    public String get(String key) {
        if (!cache.containsKey(key)) return null;
        removeNode(cache.get(key));
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


    public static void main(String[] args) {
        LruCache cache = new LruCache(2);
        cache.put("java", "8");
        cache.put("spring", "5.0");
        System.out.println(cache.get("java"));
        cache.put("perl", "1.0");;
        System.out.println(cache.get("spring"));
        System.out.println(cache.get("java"));
        System.out.println(cache.get("perl"));

    }
}

class Node {
    String key;
    String value;
    Node previous;
    Node next;
}
