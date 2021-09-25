/**
 @date: October 13, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/sort-list/

 Space/Time Complexity:
 Space: O(1),
 Time: O(n * log(n))
 */
public class MergeSortList {

    public ListNode sortList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode mid = getMiddle(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left, right);
    }

    private ListNode getMiddle(ListNode head){
        ListNode prev = null;

        while(head != null && head.next != null){
            prev = prev == null ? head : prev.next;
            head = head.next.next;
        }
        ListNode mid = prev.next;
        prev.next = null;
        return mid;
    }

    private ListNode merge(ListNode left, ListNode right){
        if(left == null){
            return right;
        }else if(right == null){
            return left;
        }

        ListNode result = null;

        if(left.val <= right.val){
            result = left;
            result.next = merge(left.next, right);
        }else{
            result = right;
            result.next = merge(left, right.next);
        }
        return result;
    }
}