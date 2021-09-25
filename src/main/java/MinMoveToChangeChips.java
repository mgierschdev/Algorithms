/**
 @date: Nov 5, 2020
 @author: Maximiliam Gierschmann

 Leetcode reference: Daily challange


 Space/Time Complexity:
 Space: O(1): where n is the size of the input
 Time: O(n): where n is the size of the input
 */

public class MinMoveToChangeChips {
    public int minCostToMoveChips(int[] position){
        int even = 0, odd = 0;
        for(int i : position){
            if(i % 2 == 0){
                odd ++;
            }else{
                even ++;
            }
        }
        return Math.min(odd, even);
    }
}