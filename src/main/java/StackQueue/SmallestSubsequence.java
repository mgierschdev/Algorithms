package StackQueue;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


import java.util.HashMap;
import java.util.Stack;

/**
 @date: October 11, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/

 Space/Time Complexity:
 Space: O(n)
 Time: O(n * b)
 */

public class SmallestSubsequence {
    public String smallestSubsequence(String s) {
        boolean[] visited = new boolean[26];
        StringBuilder builder = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        char[] word = s.toCharArray();

        for(char c : word){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < word.length; i++){
            char c = word[i];

            if(visited[c - 'a']){
                map.put(c, map.get(c) - 1);
                continue;
            }

            //check if is higher and there is still characters we remove from stack
            while(stack.size() != 0 && (stack.peek() - 'a' >= c - 'a') && map.get(stack.peek() ) > 0){
                visited[stack.peek() - 'a'] = false;
                stack.pop();
            }

            stack.push(c);
            visited[c - 'a'] = true;
            map.put(c, map.get(c) - 1);
        }

        while(stack.size() != 0){
            builder.append(stack.pop());
        }

        builder.reverse();
        return builder.toString();
    }
}
