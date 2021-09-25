import java.util.LinkedList;
import java.util.List;

/**
 @date: October 2, 2020
 @author: Maximiliam Gierschmann
 leetcode reference: https://leetcode.com/problems/combination-sum/

 Space/Time Complexity:
 Time: Taking into consideration the height and the length of the recursive tree, the max number of levels will be the target and the max length per floor will be the length(candidates)
 so the complexity will be O(target ^ length(candidates)) or O(n ^ m)..

 Space: The same as the time complexity will be O(k) being k < n ^ m, for the max stored stack at any given time.
 */

public class CombinationSum {
    List<List<Integer>> combinations = new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target){
        findCombinations(new LinkedList<>(), candidates, target, 0);
        return combinations;
    }

    public void findCombinations(LinkedList<Integer> list, int[] candidates, int target, int index){
        if(target == 0){
            LinkedList<Integer> tmp = new LinkedList<>(list);
            combinations.add(tmp);
        }

        for(int i = index; i < candidates.length; i++){
            if(target - candidates[i] >= 0){
                list.add(candidates[i]);
                findCombinations(list, candidates, target - candidates[i], i);
                list.remove(list.size() - 1);
            }
        }
    }
}