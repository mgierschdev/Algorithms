package Array;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */

//Example 1
//
//        Input
//        s = "ADOBECODEBANC"
//        t = "ABC"
//
//        Output
//        "BANC"
//
//        Explanation
//        The minimum window substring "BANC" includes ‘A’, ‘B’, and ‘C’.

import java.util.HashMap;

public class MinimumWindowSubstring {

    //S="ADOBECODEBANC"
    //T="ABC"
    //s = "ADOBECODEBANC", t = "ABC"

    public String minWindow(String s, String t) {

        HashMap<Character, Integer> target = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        int left = 0, right = 0, formed = 0, minlen = Integer.MAX_VALUE, minIndex = 0;

        for(char c : t.toCharArray()){
            target.put(c, target.getOrDefault(c, 0) + 1);
        }

        while(right < s.length()){
            char current = s.charAt(right);

            window.put(current, window.getOrDefault(current, 0) + 1);

            if(target.containsKey(current) && window.get(current).equals(target.get(current))){
                formed++;
            }

            while(formed == target.size()){

                // update MINS
                if(right - left + 1 < minlen){
                    minlen = right - left + 1;
                    minIndex = left;
                }

                char cI = s.charAt(left);

                window.put(cI, window.get(cI) - 1);

                if(target.containsKey(cI) && (window.get(cI) < target.get(cI))){
                    formed--;
                }

                left++;
            }

            right++;
        }

        return minlen == Integer.MAX_VALUE ? "" : s.substring(minIndex, minIndex + minlen);
    }

    public static void main(String[] args) {
        MinimumWindowSubstring solution = new MinimumWindowSubstring();
        String s = "ADOBECODEBANC";
        String t = "ABC";



        String result = solution.minWindow(s, t);
        System.out.println("Result: " + result);
    }
}