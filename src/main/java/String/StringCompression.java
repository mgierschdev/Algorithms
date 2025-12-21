package String;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


/**
 @date: September 28, 2023
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/string-compression

 Category: Strings, number to string parsing, pointers

 Space/Time Complexity:
 Space: O(a)
 Time: O(nodes ^ branching factor)
 */
public class StringCompression {
    public int compress(char[] chars) {
        int group = 0, res = 0, i = 0;

        while(i < chars.length){
            group = 1;

            while(group + i < chars.length &&
                    chars[i] == chars[i + group]){
                group++;
            }

            chars[res++] = chars[i];

            if(group > 1){
                for(char c : Integer.toString(group).toCharArray()){
                    chars[res++] = c;
                }
            }

            i += group;
        }

        return res;
    }
}
