package StackQueue;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


import java.util.Stack;

/**
 @date: September 28, 2023
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/removing-stars-from-a-string/

 Category: Strings, stack
 */

public class RemoveStars {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){

            if(c != '*'){
                stack.push(c);
            }else{
                stack.pop();
            }
        }

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        sb.reverse();

        return sb.toString();
    }
}
