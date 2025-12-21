package Math;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


public class Prime {
    public boolean isPrime(int N){
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if(N % i == 0){
                return false;
            }
        }
        return true;
    }
}
