package Util;

import java.util.Collections;
import java.util.PriorityQueue;

/*
Problem: Maintain running median over a sliding window for median-of-stream algorithms.
Goal: Support offer/remove while retrieving median in O(1) time.
Approach: Two heaps (max for lower half, min for upper half) kept size-balanced.
Time: O(log n) per offer/remove, O(1) for getMean.
Space: O(n) for stored window elements.
Tags: heap, sliding-window
*/
public class MeanQueue {
    private PriorityQueue<Integer> min;
    private PriorityQueue<Integer> max;

    public MeanQueue() {
        min = new PriorityQueue<>();
        max = new PriorityQueue<>(Collections.reverseOrder());
    }

    public double getMean() {
        return size() % 2 == 0 ? (min.peek() + (long) max.peek()) / 2.0 : max.peek();
    }

    public void offer(int val) {
        max.offer(val);
        min.offer(max.poll());

        if (max.size() < min.size()) {
            max.offer(min.poll());
        }
    }

    public boolean remove(int val) {
        return min.remove(val) || max.remove(val);
    }

    public int size() {
        return min.size() + max.size();
    }
}
/*
Usage:
    public double[] medianSlidingWindow(int[] nums, int k) {
        MeanQueue queue = new MeanQueue();
        double[] result = new double[nums.length - k + 1];
        int index = 0;

        for(int i = 0; i < nums.length; i++){
            queue.offer(nums[i]);

            if(queue.size() == k){
                double mid = queue.getMean();
                result[index++] = mid;
                queue.remove(nums[i + 1 - k]);
            }
        }

        return Arrays.copyOfRange(result, 0, index);
    }
 */
