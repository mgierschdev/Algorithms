package Util;

/*
Problem: Represent a singly linked list node reused by list algorithms.
Goal: Offer a lightweight container with value and next pointer for constructing test lists.
Approach: Public fields and simple constructors to ease manual wiring in algorithms.
Time: O(1) per field access or mutation.
Space: O(1) per node instance.
Tags: linked-list, data-structure
*/
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
