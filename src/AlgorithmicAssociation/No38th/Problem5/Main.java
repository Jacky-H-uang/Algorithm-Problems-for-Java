package AlgorithmicAssociation.No38th.Problem5;

import java.util.*;

public class Main
{
    public static int N;
    public static int K;
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        K = in.nextInt();

        // dp(i , j , l) 前 i 个物品选 j 个物品且重量总和 % K == l
        int[][][] dp = new int[N+1][5][K];

        int[] arr = new int[N+1];

        for(int i = 1; i <= N; ++i)      arr[i] = in.nextInt();

        // Initialize
        for(int i = 0; i <= N; ++i) {
            for(int j = 0; j <= 4; ++j) {
                for(int k = 0; k < K; ++k) {
                    dp[i][j][k] = Integer.MIN_VALUE;
                }
            }
        }

        dp[0][0][0] = 0;

        for(int i = 1; i <= N; ++i)
        {
            for(int j = 0; j <= 4; ++j)
            {
                for(int k = 0; k < K; ++k)
                {
                    // 选物品为 0 的时候
                    if(j == 0)      dp[i][j][k] = dp[i-1][j][k];
                    // 不选的时候的状态转移 : dp(i,j,l) = dp(i-1,j,l)
                    // 选的时候的状态转移：dp(i , j ,l) = dp(i - 1,j - 1,((K - arr[i]) % K + K) % K) + arr[i])
                    //                  选的时候的最后一个状态的确定，如果选择的话就是减去arr[i] 之后取模的结果
                    else            dp[i][j][k] = Math.max(dp[i-1][j][k] , dp[i-1][j-1][((k-arr[i])%K+K)%K] + arr[i]);
                }
            }
        }

        System.out.println(dp[N][4][0]);
    }
}