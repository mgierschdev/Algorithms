// Leetcode problem 264.
//An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
import java.util.ArrayList;

public class UglyNumberII {

    public int nthUglyNumber(int n) {

        int a = 0;
        int b = 0;
        int c = 0;

        ArrayList<Integer> uglyNumbers = new ArrayList<>();
        uglyNumbers.add(1);

        while(uglyNumbers.size() < n){
            int nextNumber = Math.min(Math.min(uglyNumbers.get(a) * 2, uglyNumbers.get(b) * 3) , uglyNumbers.get(c) * 5);
            uglyNumbers.add(nextNumber);
            if(uglyNumbers.get(a) * 2 == nextNumber){
                a++;
            }

            if(uglyNumbers.get(b) * 3 == nextNumber){
                b++;
            }

            if(uglyNumbers.get(c) * 5 == nextNumber){
                c++;
            }

            System.out.println("Ugly "+nextNumber);
        }
        return uglyNumbers.get(uglyNumbers.size() - 1);
    }

    private boolean isUgly(int num) {
        if (num == 1) {
            return true;
        }

        if (num == 0) {
            return false;
        }

        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 3 == 0) {
                num /= 3;
            } else if (num % 5 == 0) {
                num /= 5;
            } else {
                return false;
            }
        }

        return true;
    }
}
