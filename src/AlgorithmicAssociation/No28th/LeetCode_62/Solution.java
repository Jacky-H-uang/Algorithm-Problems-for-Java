package AlgorithmicAssociation.No28th.LeetCode_62;

public class Solution
{
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[n][m];

        // Boundary:
        for(int i = 0; i < n; ++i)
        {
            dp[i][0] = 1;
        }
        for(int j = 0; j < m; ++j)
        {
            dp[0][j] = 1;
        }

        // 状态转移方程：dp[i][j] = dp[i-1][j] + dp[i][j-1]
        for(int i = 1; i < n; ++i)
        {
            for(int j = 1; j < m; ++j)
            {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[n-1][m-1];
    }
}
