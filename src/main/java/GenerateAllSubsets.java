import java.util.LinkedList;
import java.util.List;

/**
 @date: October 2, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/subsets/
 Similar problem: Power set

 Complexity:
 Time/Space: O(n * 2^n), since there is at least n * 2^n subsets of n elements, we cannot beat that time/space
 */

public class GenerateAllSubsets {
    //Generating all unique subsets using bit-masking
    public List<List<Integer>> subsetsBitMasking(int[] num) {
        List<List<Integer>> result = new LinkedList<>();
        int mask = (1 << num.length) - 1;

        for(int i = 0; i <= mask; i++){
            List<Integer> list = new LinkedList<>();

            for(int j = 0; j < num.length; j++){

                int bit = (1 << j) & i;
                if(bit != 0){
                    list.add(num[j]);
                }
            }
            result.add(list);
        }
        return result;
    }

    //Generating all unique subsets using backtraking
    private final List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> subsetsBacktracking(int[] nums){
        result.add(new LinkedList<>());
        for(int i = 0; i < nums.length; i++){
            subsetsUtil(nums, i, new LinkedList<>());
        }
        return result;
    }

    private void subsetsUtil(int[] nums, int index, List<Integer> list){
        if(index == nums.length){
            return;
        }
        list.add(nums[index]);
        List<Integer> tmp = new LinkedList<>(list);
        result.add(tmp);

        for(int i = index + 1; i < nums.length; i++) {
            subsetsUtil(nums, i, list);
            list.remove(list.size() - 1);
        }
    }
    //Generating all unique subsets in an iterative way (Cascading)
    public List<List<Integer>> subsetsCascading(int[] nums){
        List<List<Integer>> output = new LinkedList<>();
        output.add(new LinkedList<>());//empty

        for(int num : nums){
            List<List<Integer>> newSubset = new LinkedList<>();
            for(List<Integer> l : result){
                newSubset.add(new LinkedList<>(l){{add(num);}});
            }
            output.addAll(newSubset);
        }
        return output;
    }
}