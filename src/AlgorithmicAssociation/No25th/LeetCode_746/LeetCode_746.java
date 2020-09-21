package AlgorithmicAssociation.No25th.LeetCode_746;

class Solution {
    // 动态规划:
    // 状态设置：dp[i]表示到达 i 阶楼梯需要耗费的最低花费
    // 状态计算：状态转移方程：dp[i] = cost[i] + MIN{ dp[i-1] , dp[i-2] }
    public int minCostClimbingStairs(int[] cost)
    {
        int len = cost.length;
        int[] dp = new int[len];

        // 初始化
        dp[0] = cost[0];
        dp[1] = cost[1];

        for(int i = 2; i < len ;++i)
        {
            dp[i] = cost[i] + Math.min(dp[i-1],dp[i-2]);
        }

        return Math.min(dp[len-1],dp[len-2]);
    }
}


public class LeetCode_746
{
    // 测试数据
    public static void main(String[] args)
    {
        int[] a = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        Solution s = new Solution();
        System.out.println(s.minCostClimbingStairs(a));
    }
}
