/**
 @date: October 11, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/

 Space/Time Complexity:
 Space: O(n)
 Time: O(n)
 */
public class MaxNestingDepth {
    public int maxDepth(String s) {
        char[] word = s.toCharArray();
        int depth = 0, count = 0;

        for(int i = 0; i < word.length; i++){
            if(word[i] == '('){
                count++;
            }else if(word[i] == ')'){
                depth = Math.max(depth, count);
                count--;
            }
        }
        return depth;
    }
}