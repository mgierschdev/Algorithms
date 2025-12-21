package String;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


/**
 @date: October 1, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/

 Space/Time Complexity:
 Space: O(n): where n is the size of the string being generated
 Time: O(n): where n is the size of string in the loop, to append to the StringBuilder
 */

public class StringWithOddCount {
    public String generateTheString(int n) {
        if(n == 0){
            return "";
        }

        StringBuilder s = new StringBuilder();
        int index = 0;

        if(n % 2 == 0){
            index = n - 1;
        }else{
            index = n;
        }

        for(int i = 0; i < index; i++){
            s.append('a');
        }

        if(n % 2 == 0){
            s.append('b');
        }

        return s.toString();
    }
}
