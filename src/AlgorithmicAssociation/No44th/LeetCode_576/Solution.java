package AlgorithmicAssociation.No44th.LeetCode_576;



public class Solution {
    public int findPaths(int m, int n, int N, int i, int j) {
        // dp[i][j][k]:表示从(i,j)出发第k步出界的路径总数，等价于从外界出发第k步走到(i,j)的路径总数
        long[][][] dp = new long[m + 2][n + 2][N + 1];
        int mod = 1000000007;
        if (N == 0) {
            return 0;
        }
        for (int r = 0; r <= m + 1; r++) {
            dp[r][0][0] = 1;
            dp[r][n + 1][0] = 1;
        }
        for (int c = 0; c <= n + 1; c++) {
            dp[0][c][0] = 1;
            dp[m + 1][c][0] = 1;
        }

        for (int k = 1; k <= N; k++) {
            for (int r = 1; r <= m; r++) {
                for (int c = 1; c <= n; c++) {
                    dp[r][c][k] = (
                                    dp[r - 1][c][k - 1] +
                                    dp[r + 1][c][k - 1] +
                                    dp[r][c - 1][k - 1] +
                                    dp[r][c + 1][k - 1]
                            ) % mod;
                }
            }
        }
        long ans = 0;

        for (int k = 1; k <= N; k++)        ans = (ans + dp[i + 1][j + 1][k]) % mod;

        return (int)ans;
    }
}