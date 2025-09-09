import java.io.*;
import java.util.*;

public class max1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        
        while (t-- > 0) {
            String[] input = br.readLine().trim().split(" ");
            long a = Long.parseLong(input[0]);
            long b = Long.parseLong(input[1]);
            long maxSum = -1;

            // Early check: if b is odd and a is even, sum cannot be even
            if ((b % 2 == 1 && a % 2 == 0)) {
                pw.println(-1);
                continue;
            }

            // Iterate through divisors of b
            for (long k = 1; k * k <= b; k++) {
                if (b % k == 0) { // k is a divisor
                    if (isValid(a, k)) {
                        long newA = a * k;
                        long newB = b / k;
                        long sum = newA + newB;
                        if (sum % 2 == 0) {
                            maxSum = Math.max(maxSum, sum);
                        }
                    }
                    // Check paired divisor b/k
                    long k2 = b / k;
                    if (k2 != k && isValid(a, k2)) {
                        long newA = a * k2;
                        long newB = b / k2;
                        long sum = newA + newB;
                        if (sum % 2 == 0) {
                            maxSum = Math.max(maxSum, sum);
                        }
                    }
                }
            }
            pw.println(maxSum);
        }
        pw.flush();
        pw.close();
    }

    private static boolean isValid(long a, long k) {
        return k > 0 && a <= Long.MAX_VALUE / k;
    }
}