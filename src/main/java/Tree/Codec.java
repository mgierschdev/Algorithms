package Tree;

import Util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
/**
 @date: October 9, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/serialize-and-deserialize-bst/

 Space/Time Complexity:
 Space: O(n), where n is the number of nodes
 Time: O(n)
 */
public class Codec {
    StringBuilder s = new StringBuilder();

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        StringBuilder s = new StringBuilder();

        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode current = q.poll();

                if(current == null){
                    s.append("null,");
                }else{
                    s.append(current.val).append(",");
                    q.offer(current.left);
                    q.offer(current.right);
                }
            }
        }
        return s.substring(0, s.length() - 1);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.compareTo("null") == 0){
            return null;
        }

        int index = 1;
        String[] numbers = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(numbers[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(index < numbers.length){
            TreeNode n = q.poll();
            if(n == null){
                continue;
            }

            if(numbers[index].compareTo("null") != 0){
                n.left = new TreeNode(Integer.parseInt(numbers[index]));
            }
            q.offer(n.left);
            index++;

            if(numbers[index].compareTo("null") != 0){
                n.right = new TreeNode(Integer.parseInt(numbers[index]));
            }
            q.offer(n.right);
            index++;
        }
        return root;
    }
}