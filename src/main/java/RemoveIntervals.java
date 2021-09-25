/**
 @date: October 4, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/remove-covered-intervals/

 Space/Time Complexity:
 Space: O(1)
 Time: O(n^2)

 Constraints:
 1 <= intervals.length <= 1000
 intervals[i].length == 2
 0 <= intervals[i][0] < intervals[i][1] <= 10^5
 All the intervals are unique.
 */

public class RemoveIntervals {
    public int removeCoveredIntervals(int[][] intervals) {
        int count = 0;
        for(int i = 0; i < intervals.length; i++){
            for(int j = 0; j < intervals.length; j++){
                int x = intervals[i][0];
                int y = intervals[i][1];
                int x1 = intervals[j][0];
                int y1 = intervals[j][1];

                if(i != j && x >= x1 &&  y  <= y1){
                    count++;
                    break;
                }
            }
        }
        return intervals.length - count;
    }
}