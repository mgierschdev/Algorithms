//Leetcode 347. TopKFrequent

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {

    public int[] FindTopKFrequent(int[] nums, int k){
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int[] current = new int[]{entry.getKey(), entry.getValue()};
            queue.add(current);
        }

        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = queue.poll()[0];
            System.out.println(result[i]);
        }

        return result;
    }
}
