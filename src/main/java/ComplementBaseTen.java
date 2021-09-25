/**
 @date: October 5, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/complement-of-base-10-integer/

 Space/Time Complexity:
 Space: O(1)
 Time: O(1) , the max time that the loop will take is 32 since we have an Integer
 */
public class ComplementBaseTen {
    public int bitwiseComplement(int N) {
        if(N == 0){
            return 1;
        }
        int i = 0, tmp = N;
        while(N != 0){
            i++;
            N = N >> 1;
        }
        int mask = (1 << i) - 1;
        return ~tmp & mask;
    }
}