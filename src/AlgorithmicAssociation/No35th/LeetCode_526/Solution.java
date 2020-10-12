package AlgorithmicAssociation.No35th.LeetCode_526;

public class Solution {
    private int count = 0;
    private boolean[] checked;              // 判断访问状态,便于剪枝

    public void dfs(int N, int pos) {
        if (pos > N)        count++;

        // 注意每次都从 1 开始
        for (int i = 1; i <= N; ++i)
        {
            if (!checked[i] && (pos % i == 0 || i % pos == 0))
            {
                checked[i] = true;
                dfs(N, pos + 1);
                checked[i] = false;
            }
        }
    }

    public int countArrangement(int N) {
        checked = new boolean[N+1];
        dfs(N, 1);
        return count;
    }
}