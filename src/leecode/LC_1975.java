package leecode;

public class LC_1975 {
    public long maxMatrixSum(int[][] matrix) {
        // total sum of absolute values
        long totalSum = 0;

        // track the minimum absolute value
        int minAbsValue = Integer.MAX_VALUE;

        // count of negative numbers
        int negativeCount = 0;

        // iterate through the matrix
        for (int[] row : matrix) {
            for (int num : row) {
                // count negatives
                if (num < 0) {
                    negativeCount++;
                }

                // calculate absolute value
                int absValue = Math.abs(num);

                // update minimum absolute value
                minAbsValue = Math.min(minAbsValue, absValue);

                // add to total sum
                totalSum += absValue;
            }
        }

        // if negative count is even, return total sum
        // else subtract twice the minimum absolute value
        if (negativeCount % 2 == 0) {
            return totalSum;
        } else {
            return totalSum - 2L * minAbsValue;
        }
    }
}
