package leecode;

public class LC_1458 {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        // dp[i][j] = max dot product using nums1[0..i], nums2[0..j],
        // where the pair (nums1[i], nums2[j]) is taken (non-empty subsequences).
        int[][] dp = new int[n][m];

        dp[0][0] = nums1[0] * nums2[0];

        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(nums1[i] * nums2[0], dp[i - 1][0]);
        }

        for (int j = 1; j < m; j++) {
            dp[0][j] = Math.max(nums1[0] * nums2[j], dp[0][j - 1]);
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                int takeBoth = nums1[i] * nums2[j];
                // extend a previous pairing subsequence or start fresh with this pair
                int extend = takeBoth + Math.max(0, dp[i - 1][j - 1]);
                // skip one element from either side
                int skip = Math.max(dp[i - 1][j], dp[i][j - 1]);
                dp[i][j] = Math.max(Math.max(takeBoth, extend), skip);
            }
        }

        return dp[n - 1][m - 1];
    }
}
