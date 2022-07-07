import java.util.ArrayList;
import java.util.Arrays;

// Generates first n prime numbers, 1000

public class GeneratePrime {
    public ArrayList<Integer> generatePrimeNumbers(Integer n){
        ArrayList<Integer> primes = new ArrayList<>();
        boolean[] numbers = new boolean[1000];
        Arrays.fill(numbers, false);

        for (int i = 2; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j = j * j) {
                numbers[j] = false;
            }
        }

        for(int i = 0; i < numbers.length; i++){
            if(!numbers[i]){
                primes.add(i);
            }
        }

        return primes;
    }
}
