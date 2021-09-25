/**
 @date: October 10, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/counting-bits/

 Complexity:
 Time: O(n)
 Space: O(n)
 */

public class CountBits {
    public int[] countBits(int num) {
        int[] digits = new int[num + 1];

        for(int i = 0; i <= num; i++){
            digits[i] = i % 2 == 0 ?  digits[i / 2] :  digits[i - 1] + 1;
        }

        return digits;
    }
}