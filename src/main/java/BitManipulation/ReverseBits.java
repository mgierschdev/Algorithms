package BitManipulation;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


// Exercise 190 Leetcode
public class ReverseBits {
    //from: 11
    //to: 11000000000000000000000000000000
    //from: 1100100
    //to: 100110000000000000000000000000
    public int reverseBits(int n) {
        int newNumber = 0;
        for(int i = 0; i < 32; i++){
            newNumber += n & 1;
            n >>>= 1;
            if(i < 31){
                newNumber <<= 1;
            }
        }
        return newNumber;
    }
}
