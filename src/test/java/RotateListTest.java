import Array.RotateList;
import Util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateListTest {
    @Test
    public void baseCase(){
        RotateList r = new RotateList();
        int[] l = new int[]{1, 2, 3, 4, 5};
        int[] rotated = new int[]{4, 5, 1, 2, 3};
        ListNode n = new ListNode();
        ListNode head = n;
        for(int i = 0; i < l.length; i++){
            n.next = new ListNode(l[i]);
            n = n.next;
        }
        n = r.rotateRight(head.next, 2);
        for (int i = 0; i < rotated.length; i++) {
            assertEquals(n.val, rotated[i]);
            n = n.next;
        }
    }

    @Test
    public void secondCase(){
        RotateList r = new RotateList();
        int[] l = new int[]{0, 1, 2};
        int[] rotated = new int[]{2, 0, 1};
        ListNode n = new ListNode();
        ListNode head = n;
        for(int i = 0; i < l.length; i++){
            n.next = new ListNode(l[i]);
            n = n.next;
        }
        n = r.rotateRight(head.next, 4);
        for (int i = 0; i < rotated.length; i++) {
            assertEquals(n.val, rotated[i]);
            n = n.next;
        }
    }
}