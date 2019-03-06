/**
 * 
 */

/**
 * @author camelliadebnath
 * 06-Mar-2019
 */
class MyHashMap {
        
    class ListNode {
        ListNode next;
        int key, val;
        
        ListNode(int key, int value) {
            this.key = key;
            this.val = value;
        }
    }
    
    class Bucket {
        final ListNode head = new ListNode(-1, -1);
    }
    
    final int size = 10000;
    final Bucket[] buckets = new Bucket[size];

    /** Initialize your data structure here. */
    public MyHashMap() {
        
    }
    
    //used to find the bucket
    private int hash(int key) {
        return key % size;
    }
    
    //used to find node by key in certain bucket
    private ListNode findNode(Bucket bucket, int key) {
        ListNode head = bucket.head;
        ListNode node = head;
        while (head != null && head.key != key) {
            //when head == null, or head.key == key, return its previous node
            node = head;
            head = head.next;
        }
        return node;
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        int i = hash(key);
        if (buckets[i] == null) buckets[i] = new Bucket();
        ListNode pre = findNode(buckets[i], key);
        if (pre.next == null) {
            pre.next = new ListNode(key, value);
        } else {
            pre.next.val = value;
        }
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int i = hash(key);
        if (buckets[i] == null) return -1;
        ListNode pre = findNode(buckets[i], key);
        if (pre.next == null) {
            return -1;
        } else {
            return pre.next.val;
        }
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int i = hash(key);
        if (buckets[i] == null) return;
        ListNode pre = findNode(buckets[i], key);
        if (pre.next == null) return;
        else pre.next = pre.next.next;
    }

}