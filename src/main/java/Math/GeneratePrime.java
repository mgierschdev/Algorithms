package Math;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


import java.util.ArrayList;
import java.util.Arrays;

// Generates first n prime numbers, 1000

public class GeneratePrime {
    public ArrayList<Integer> generatePrimeNumbers(Integer n){
        ArrayList<Integer> primes = new ArrayList<>();
        boolean[] numbers = new boolean[n + 1];
        Arrays.fill(numbers, true);
        numbers[0] = false;
        numbers[1] = false;

        for (int i = 2; i * i <= n; i++) {
            for (int j = i * i; j <= n; j += i) {
                numbers[j] = false;
                System.out.println(numbers[j] + " "+ j);
            }
            System.out.println(" ");
        }

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]){
                primes.add(i);
            }
        }

        return primes;
    }
}
