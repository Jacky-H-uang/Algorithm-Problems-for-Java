package AlgorithmicAssociation.No28th.LeetCode_63;

public class Solution
{
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];

        // Boundary:
        for(int i = 0; i < m; ++i)
        {
            if(obstacleGrid[i][0] == 1)     break;
            else                            dp[i][0] = 1;
        }
        for(int i = 0; i < n; ++i)
        {
            if(obstacleGrid[0][i] == 1)     break;
            else                            dp[0][i] = 1;

        }

        // 状态转移方程 ：dp[i][j] = obstacleGrid[i][j] == 1? 0 : dp[i-1][j] + dp[i][j-1]
        for(int i = 1; i < m; ++i)
        {
            for(int j = 1; j < n; ++j)
            {
                dp[i][j] = obstacleGrid[i][j] == 1? 0 : dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m-1][n-1];
    }
}