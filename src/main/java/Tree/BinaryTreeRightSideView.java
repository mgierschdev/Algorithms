package Tree;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


import Util.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 @date: September 27, 2023
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/binary-tree-right-side-view/

 Category: Tree , BFS, right side view

 Space/Time Complexity:
 Space: O(a)
 Time: O(n ^ 2)
 */

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null){
            return new LinkedList<>();
        }

        List<Integer> result = new LinkedList<>();
        List<List<Integer>> treeList = new LinkedList<>();

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Queue<Integer> queueLevel = new LinkedList<Integer>();

        queue.add(root);
        queueLevel.add(0);
        treeList.add(new LinkedList<>());

        while(!queue.isEmpty()){

            TreeNode currentNode = queue.poll();
            int level = queueLevel.poll();

            if(treeList.size() <= level){
                treeList.add(new LinkedList<>());
            }

            List<Integer> list = treeList.get(level);

            list.add(currentNode.val);

            if(currentNode.left != null){
                queue.add(currentNode.left);
                queueLevel.add(level + 1);
            }

            if(currentNode.right != null){
                queue.add(currentNode.right);
                queueLevel.add(level + 1);
            }
        }

        for(int lv = 0 ; lv < treeList.size(); lv++){
            List<Integer> list = treeList.get(lv);
            result.add(list.get(list.size() - 1));
        }

        return result;
    }
}
