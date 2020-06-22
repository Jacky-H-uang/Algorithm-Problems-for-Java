// 编写一个程序，找出第 n 个丑数。
// 丑数就是质因数只包含 2, 3, 5 的正整数。 
//
// 示例:
// 输入: n = 10
// 输出: 12
// 解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。
//
// 说明:
// 1 是丑数。 
// n 不超过1690。 
// 
// Related Topics 堆 数学 动态规划

  
package Dynamic_Program.leetcode.editor.cn;

// DP + 三指针
public class LeetCode264_UglyNumberIi
{
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution
    {
        public int nthUglyNumber(int n)
        {
            int[] dp = new int[n];
            if(n==0)
            {
                return 0;
            }
            int p2 = 0;
            int p3 = 0;
            int p5 = 0;
            dp[0] = 1;
            for(int i=1;i<n;i++)
            {
                dp[i] = Math.min(dp[p2]*2,Math.min(dp[p3]*3,dp[p5]*5));
                if(dp[p2]*2 == dp[i])
                {
                    p2++;
                }
                if(dp[p3]*3 == dp[i])
                {
                    p3++;
                }
                if(dp[p5]*5 == dp[i])
                {
                    p5++;
                }
            }
            return dp[n-1];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) 
    {
        Solution solution = new LeetCode264_UglyNumberIi().new Solution();
    }
}

