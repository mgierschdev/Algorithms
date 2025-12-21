package String;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 @date: October 19, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/repeated-dna-sequences/

 Space/Time Complexity:
 Space: O(n)
 Time: O(n)
 */

public class StringSequences {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> output = new LinkedList<>();

        for(int i = 0; i < s.length() - 9; i++){
            String sub = s.substring(i, i + 10);
            map.put(sub, map.getOrDefault(sub, 0) + 1);
        }

        for(Map.Entry<String, Integer> e : map.entrySet()){
            if(e.getValue() > 1){
                output.add(e.getKey());
            }
        }
        return output;
    }
}
