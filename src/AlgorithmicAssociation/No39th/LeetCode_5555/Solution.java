package AlgorithmicAssociation.No39th.LeetCode_5555;


public class Solution
{
    // 简单的动态规划
    final int maxn = 101;
    int[][] f = new int[maxn][maxn];
    public  void init() {
        for(int i = 1; i <= 5; ++i)     f[1][i] = 1;
    }

    public int countVowelStrings(int n) {
        // 初始化
        init();
        int ans = 0;

        for(int i = 2; i <= n; ++i) {           // 枚举放置字符的数量
            for(int j = 1; j <= 5; ++j) {       // 枚举元音
                for(int k = 1; k <= j; ++k) {   // 状态转移 ： f(i , j) += sum{f(i-1 , k)}  (1 <= k <= j)
                    f[i][j] += f[i-1][k];
                }
            }
        }

        for(int i = 1; i <= 5; ++i)     ans += f[n][i];

        return ans;
    }

    // zero 大佬的分析题解：组合计数
    // 或者直接用 Python 的 math 库可以直接写 ：return math.comb(n+4 , 4)   (遇事不决用 Python)
    public int countVowelStrings2(int n) {
        return (n+4)*(n+3)*(n+2)*(n+1) / 24;
    }
}