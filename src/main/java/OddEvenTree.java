import java.util.LinkedList;
import java.util.Queue;

/**
 @date: October 5, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/even-odd-tree/

 Space/Time Complexity:
 Space: O(H), H the max diameter of a floor
 Time: O(N), total number of nodes
 */

public class OddEvenTree {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int floor = 1;

        while(!queue.isEmpty()){
            int size = queue.size();
            int prev = 0;

            for(int i = 0; i < size; i++){
                TreeNode current = queue.poll();
                int val = current.val;

                //even floor
                if(floor % 2 == 0){
                    if(val % 2 != 0 || prev !=  0 && prev <= val){
                        return false;
                    }
                }else{ // odd floor
                    if(val % 2 == 0 || prev !=  0 && prev >= val){
                        return false;
                    }
                }

                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }
                prev = val;
            }
            floor++;
        }
        return true;
    }
}