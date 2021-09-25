import java.util.LinkedList;

/**
 @date: October 1, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/number-of-recent-calls/

 Space/Time Complexity:
 Space: O(n): where N is the max space that the list can take at any given time, within 3000
 Time: O(n): The max time that takes to remove elements of the list at any given time

 Constraints:
 1 <= t <= 104
 Each test case will call ping with strictly increasing values of t.
 At most 104 calls will be made to ping.
*/

public class RecentCounter {
    public LinkedList<Integer> list = new LinkedList<>();

    //Removes all elements
    public RecentCounter() {
        list.clear();
    }

    public int ping(int t) {
        list.add(t);

        while(list.getFirst() < t - 3000){
            list.removeFirst();
        }
        return list.size();
    }
}