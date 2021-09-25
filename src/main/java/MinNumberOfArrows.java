import java.util.Arrays;
import java.util.Comparator;
/**
 @date: October 10, 2020
 @author: Maximiliam Gierschmann
 leetcode reference: https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/

 Space/Time Complexity:
 Time: O(n*log(n))
 Space: O(1)
 */
public class MinNumberOfArrows {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 0){
            return 0;
        }

        int arrows = 1;
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        int firedArrow = points[0][1];
        int left, right;

        for(int i = 1; i < points.length; i++){
            left = points[i][0];
            right = points[i][1];

            if(!(firedArrow >= left && firedArrow <= right)){
                arrows++;
                firedArrow = right;
            }
        }
        return arrows;
    }
}
