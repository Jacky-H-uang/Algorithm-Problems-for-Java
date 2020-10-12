package AlgorithmicAssociation.No35th.LeetCode_401;
import java.util.*;

public class Solution
{
    private List<String> ans = new ArrayList<>();
    public int transform(int x) {
        int cnt = 0;
        while(x > 0)
        {
            if((x & 1) > 0)   cnt++;
            x >>= 1;
        }

        return cnt;
    }
    public void bfs(int num) {
        for(int i = 0; i < 12; ++i)
        {
            for(int j = 0; j < 60; ++j)
            {
                // 注意分钟前面的 0 要判断
                if(transform(i) + transform(j) == num)      ans.add(i + ":" + (j<10? "0" + j : j));
            }
        }
    }
    public List<String> readBinaryWatch(int num) {
        bfs(num);
        return ans;
    }
}