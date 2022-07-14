package Util;

// Bitwise tips and tricks

// ~0 it is equal a sequence of ones
// ~0  << 2, it is a sequence of ones followed by 2 zeros and adding an AND will clear the last 2 digits
// shifting left by one 0110 << 1 it is equal to 0110 + 0110 and 0110 * 2

// x ^ 0 = x
// x ^ 1 = ~x
// x ^ x = 0

// x & 0 = 0
// x & 1 = x
// x & x = x

// x | 0 = x
// x | 1 = 1
// x | x = x

// Arithmetics shift >>
// Arithmetic will divide by  2

// Logical shift >>>
// Logical will shift including the most significant (sign bit)
public class BitOperations {

    // gets but in position i
    boolean getBit(int num, int i){
        return ((num & (1 << i)) != 0);
    }

    public int setBit(int num, int i){
        return num | ( 1 << i);
    }

    public int clearBit(int num, int i){
        int mask = ~(1 << i);
        return num & mask;
    }

    // clears all bits through i, inclusive
    public int clearBitsThroughI(int num, int i){
        int mask = (1 << i) - 1;
        return num & mask;
    }

    public int clearBitIThroughZero(int num, int i){
        int mask = (-1 << (i + 1));
        return num & mask;
    }

    // Update bit
    public int updateBit(int num, int i, boolean bitIs1){
        int value = bitIs1 ? 1 : 0;
        int mask = ~(1 << i);
        return (mask & value) | (value << i);
    }
}
