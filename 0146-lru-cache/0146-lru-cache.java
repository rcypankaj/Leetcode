class LRUCache {
    class Node {
        int key;
        int val;
        Node prev;
        Node next;
        Node (int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    private int capacity;
    private Node head;
    private Node tail;
    private Map<Integer, Node> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head = new Node(0, 0);
        this.tail = new Node(0, 0);
        this.head.next = tail;
        this.tail.prev = head;
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insertToTail(Node node) {
        Node prev = tail.prev;

        prev.next = node;
        node.prev = prev;

        node.next = tail;
        tail.prev = node;
    }
    
    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        Node node = map.get(key);
        remove(node);
        insertToTail(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.val = value;

            remove(node);
            insertToTail(node);
        } else {
            if (map.size() == capacity) {
                Node lru = head.next;

                remove(lru);
                map.remove(lru.key);
            }

            Node node = new Node(key, value);
            insertToTail(node);
            map.put(key, node);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */