package Tree;

import java.util.LinkedList;
import java.util.List;
//Leetcode problem
// 1104. https://leetcode.com/problems/path-in-zigzag-labelled-binary-tree/
//each level 2 to the power of the level
// 2^0 = 1. 2^1 = 2, 2^2 = 4 ....
// The number of nodes = to the sum of each level
// (2^0) + (2^1).... = (2 ^ n + 1) - 1.
//(2 ^ n + 1) = 1
// 2 ^ n = 1

public class PathInZigZagTree {
    public List<Integer> pathInZigZagTree(int label) {
        LinkedList<Integer> result = new LinkedList<>();

        int parent = label;
        result.add(parent);

        while(parent != 1){
            int level = (int)(Math.log(parent) / Math.log(2));
            int offset = (int)(Math.pow(2, level + 1) - 1 - parent);
            parent = ((int)Math.pow(2, level) + offset) / 2;

            result.addFirst(parent);
        }

        return result;
    }
}
