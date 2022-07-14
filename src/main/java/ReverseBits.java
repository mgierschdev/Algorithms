// Exercise 190 Leetcode

public class ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {

        while(n != 0){
            int tmp = (n  << 1) ^ 1;
            System.out.println("Digit "+Integer.toBinaryString(tmp));
            n = n >> 1;

        }

        System.out.println(" ");
        return 2;

    }
}
