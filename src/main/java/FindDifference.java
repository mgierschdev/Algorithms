import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
/**
 @date: September 29, 2023
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/find-the-difference-of-two-arrays/

 Category: HashSet, HashMap iteration

 Space/Time Complexity:
 */

public class FindDifference {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<List<Integer>> answer = new LinkedList<>();
        answer.add(new LinkedList());
        answer.add(new LinkedList());

        for(int i : nums1){
            set.add(i);
        }

        for(int j : nums2){
            set2.add(j);
        }

        for(int i : set){
            if(!set2.contains(i)){
                answer.get(0).add(i);
            }
        }

        for(int i : set2){
            if(!set.contains(i)){
                answer.get(1).add(i);
            }
        }

        return answer;
    }
}
