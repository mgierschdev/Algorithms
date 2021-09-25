/**
 @date: October 7, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/minimum-one-bit-operations-to-make-integers-zero/

 Check: https://en.wikipedia.org/wiki/Gray_code, for reference

 Space/Time Complexity:
 Space: O(1)
 Time: O(1)
 */

public class GrayColor {
    public int minimumOneBitOperations(int n) {
        n ^= n >> 16;
        n ^= n >> 8;
        n ^= n >> 4;
        n ^= n >> 2;
        n ^= n >> 1;
        return n;
    }
}
