package leecode;

public class LC_1390 {
    public int sumFourDivisors(int[] nums) {
        int totalSum = 0;

        for (int num : nums) {
            int divisorSum = 0;
            int divisorCount = 0;

            // We only need to check up to sqrt(num)
            for (int i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    // 'i' is a divisor
                    divisorSum += i;
                    divisorCount++;

                    // Check if i and num/i are different
                    if (i != num / i) {
                        divisorSum += num / i;
                        divisorCount++;
                    }

                    // Early exit if we already have more than 4 divisors
                    if (divisorCount > 4) {
                        break;
                    }
                }
            }

            if (divisorCount == 4) {
                totalSum += divisorSum;
            }
        }

        return totalSum;
    }
}
