package Hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
/**
 @date: September 28, 2023
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/unique-number-of-occurrences/

 Category: HashMap, HashMap iteration

 Space/Time Complexity:
 */

public class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> oc = new HashSet<>();

        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(oc.contains(e.getValue())){
                return false;
            }
            oc.add(e.getValue());
        }

        return true;
    }
}
