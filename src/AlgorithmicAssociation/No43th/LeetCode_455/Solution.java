package AlgorithmicAssociation.No43th.LeetCode_455;

import java.util.*;

public class Solution
{
    // 贪心排序
    public int findContentChildren(int g[],int s[]) {
        Arrays.sort(s);
        Arrays.sort(g);
        int ans = 0;
        int i = 0;
        int j = 0;
        while(i < g.length && j < s.length)
        {
            if(g[i] <= s[j])
            {
                ans++;
                ++i;
            }
            ++j;
        }

        return ans;
    }
}