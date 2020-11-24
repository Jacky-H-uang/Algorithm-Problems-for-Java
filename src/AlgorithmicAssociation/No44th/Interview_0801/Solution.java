package AlgorithmicAssociation.No44th.Interview_0801;

public class Solution
{
    public int waysToStep(int n) {
        long[] dp = new long[n+1];
        if(n >= 1)      dp[1] = 1;
        if(n >= 2)      dp[2] = 2;
        if(n >= 3)      dp[3] = 4;

        for(int i =4; i <= n; ++i)      {
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
            dp[i] %= 1000000007;
        }

        return (int)dp[n] % 1000000007;
    }
}