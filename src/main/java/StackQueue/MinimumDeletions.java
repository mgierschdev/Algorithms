package StackQueue;

import java.util.Stack;
/**
 @date: September 28, 2023
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/

 Category: Strings, stack
 */

public class MinimumDeletions {
    public int minimumDeletions(String s) {
        int count = 0;
        Stack<Character> stack = new Stack();

        for(char c : s.toCharArray()){
            if(!stack.isEmpty() &&
                    stack.peek() == 'b' &&
                    c == 'a'){
                stack.pop();
                count++;
            }else{
                stack.push(c);
            }
        }

        return count;
    }
}
