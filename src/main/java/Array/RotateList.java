package Array;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


import Util.ListNode;

/**
 date: October 7, 2020,
 author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/rotate-list/

 Space/Time Complexity:
 Space: O(1)
 Time: O(n)
 */

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }
        //we find the start of the first element
        ListNode tmp = head;
        ListNode last = head;
        ListNode slow = head;

        int size = 0;
        while(tmp != null){
            tmp = tmp.next;
            size++;
        }

        k %= size;

        //move the pointer k positions
        for(int i = 0; i < k; i++){
            last = last.next;
        }

        //move the slow pointer and the fast pointer, to the first and last element of the new list
        while(last.next != null){
            last = last.next;
            slow = slow.next;
        }

        //we set the first element of the list, the last element
        last.next = head;
        head = slow.next;
        slow.next = null;

        return head;
    }
}
