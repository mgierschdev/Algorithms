/**
 @date: September 28, 2023
 @author: Maximiliam Gierschmann
 leetcode reference: https://leetcode.com/problems/maximum-value-of-a-string-in-an-array/

 Space O(n), Time (n * m)

 Category: Strings
 */

public class MaximumValueOfAString {
    public int maximumValue(String[] strs) {
        int max = 0;

        for(String str : strs){
            if(eval(str)){
                max = Math.max(max, str.length());
            }else{
                max = Math.max(max, Integer.parseInt(str));
            }
        }

        return max;
    }

    public boolean eval(String s){
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                return true;
            }
        }

        return false;
    }
}
