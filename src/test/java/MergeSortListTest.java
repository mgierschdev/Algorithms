import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortListTest {
    @Test
    public void baseCase(){
        ListNode node = new ListNode(4);
        ListNode head = node;
        node.next = new ListNode(2);
        node = node.next;
        node.next = new ListNode(1);
        node = node.next;
        node.next = new ListNode(-1);

        MergeSortList m = new MergeSortList();
        ListNode result = m.sortList(head);

        int[] output = new int[]{-1, 1, 2, 4};
        int i = 0;
        while(result != null){
            assertEquals(result.val, output[i++]);
            result = result.next;
        }
    }
}