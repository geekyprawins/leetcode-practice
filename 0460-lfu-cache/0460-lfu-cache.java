class LFUCache {

/* To implement a node in doubly linked list that will store data items */
class Node {
    int key, value, cnt;
    Node next;
    Node prev;
    
    Node(int _key, int _value) {
        key = _key;
        value = _value;
        cnt = 1;
    }
}

// To implement the doubly linked list
class List {
    int size; // Size 
    Node head; // Dummy head
    Node tail; // Dummy tail
    
    // Constructor
    List() {
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }
    
    // Function to add node in front
    void addFront(Node node) {
        Node temp = head.next;
        node.next = temp;
        node.prev = head;
        head.next = node;
        temp.prev = node;
        size++;
    }
    
    // Function to remove node from the list
    void removeNode(Node delnode) {
        Node prevNode = delnode.prev;
        Node nextNode = delnode.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        size--;
    }
}
    private Map<Integer, Node> keyNode; // Hashmap to store the key-nodes pairs
    private Map<Integer, List> freqListMap; // Hashmap to maintain the lists with different frequencies
    private int maxSizeCache; // Max size of cache
    private int minFreq; // To store the frequency of least frequently used data-item
    private int curSize; // To store current size of cache
    
    // Constructor
    public LFUCache(int capacity) {
        maxSizeCache = capacity;
        minFreq = 0;
        curSize = 0;
        keyNode = new HashMap<>();
        freqListMap = new HashMap<>();
    }
    
    // Method to update frequency of data-items
    private void updateFreqListMap(Node node) {
        // Remove from Hashmap
        keyNode.remove(node.key);
        
        // Update the frequency list hashmap
        freqListMap.get(node.cnt).removeNode(node);
        
        // If node was the last node having its frequency
        if (node.cnt == minFreq && freqListMap.get(node.cnt).size == 0) {
            // Update the minimum frequency
            minFreq++;
        }
        
        // Creating a dummy list for next higher frequency
        List nextHigherFreqList = new List();
        
        // If the next higher frequency list already exists
        if (freqListMap.containsKey(node.cnt + 1)) {
            // Update pointer to already existing list
            nextHigherFreqList = freqListMap.get(node.cnt + 1);
        }
        
        // Increment the count of data-item
        node.cnt += 1;
        
        // Add the node in front of higher frequency list
        nextHigherFreqList.addFront(node);
        
        // Update the frequency list map
        freqListMap.put(node.cnt, nextHigherFreqList);
        keyNode.put(node.key, node);
    }
    
    // Method to get the value of key from LFU cache
    public int get(int key) {
        // Return the value if key exists
        if (keyNode.containsKey(key)) {
            Node node = keyNode.get(key); // Get the node
            int val = node.value; // Get the value
            updateFreqListMap(node); // Update the frequency
            // Return the value
            return val;
        }
        // Return -1 if key is not found
        return -1;
    }
    
    // Method to insert key-value pair in LFU cache
    public void put(int key, int value) {
        /* If the size of Cache is 0, 
        no data-items can be inserted */
        if (maxSizeCache == 0) {
            return;
        }
        
        // If key already exists
        if (keyNode.containsKey(key)) {
            // Get the node
            Node node = keyNode.get(key);
            // Update the value
            node.value = value;
            // Update the frequency
            updateFreqListMap(node);
        } else {
            // If cache limit is reached
            if (curSize == maxSizeCache) {
                // Remove the least frequently used data-item
                List list = freqListMap.get(minFreq);
                keyNode.remove(list.tail.prev.key);
                
                // Update the frequency map
                freqListMap.get(minFreq).removeNode(list.tail.prev);
                // Decrement the current size of cache
                curSize--;
            }
            // Increment the current cache size
            curSize++;
            
            // Adding new value to the cache
            minFreq = 1; // Set its frequency to 1
            
            // Create a dummy list
            List listFreq = new List();
            
            // If the list already exists
            if (freqListMap.containsKey(minFreq)) {
                // Update the pointer to already present list
                listFreq = freqListMap.get(minFreq);
            }
            
            // Create the node to store data-item
            Node node = new Node(key, value);
            
            // Add the node to dummy list
            listFreq.addFront(node);
            
            // Add the node to Hashmap
            keyNode.put(key, node);
            
            // Update the frequency list map
            freqListMap.put(minFreq, listFreq);
        }
    
}
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */