package Math;

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
