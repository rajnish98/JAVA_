import java.util.*;

public class max { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long maxSum = -1; // Initialize max even sum to -1
            
            // Find all divisors of b
            for (long k = 1; k * k <= b; k++) {
                if (b % k == 0) { // k is a divisor
                    // Check for k
                    if (isValid(a, b, k)) {
                        long newA = a * k;
                        long newB = b / k;
                        long sum = newA + newB;
                        if (sum % 2 == 0) { // Sum must be even
                            maxSum = Math.max(maxSum, sum);
                        }
                    }
                    
                    // Check for b/k (the paired divisor)
                    long k2 = b / k;
                    if (k2 != k && isValid(a, b, k2)) {
                        long newA = a * k2;
                        long newB = b / k2;
                        long sum = newA + newB;
                        if (sum % 2 == 0) { // Sum must be even
                            maxSum = Math.max(maxSum, sum);
                        }
                    }
                }
            }
            
            System.out.println(maxSum);
        }
        sc.close();
    }
    
    // Check if k is valid (a * k doesn't exceed constraints)
    private static boolean isValid(long a, long b, long k) {
        // Check for overflow or constraint violation
        if (k > 0 && a <= Long.MAX_VALUE / k) {
            return true;
        }
        return false;
    }
}
