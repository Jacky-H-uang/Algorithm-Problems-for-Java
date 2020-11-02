package AlgorithmicAssociation.No39th.LeetCode_5557;



// 理解有点模糊
public class Solution
{
    public String kthSmallestPath(int[] destination, int k)
    {
        int h = destination[1];
        int v = destination[0];
        int[][] comb = new int[h+v][h];
        comb[0][0] = 1;
        for(int i = 1; i < h + v; ++i)
        {
            comb[i][0] = 1;
            for(int j = 1; j <= i && j < h; ++j)
            {
                comb[i][j] = comb[i-1][j-1] + comb[i-1][j];
            }
        }

        StringBuilder ans = new StringBuilder();
        int boundary = h + v;
        for(int i = 0; i < boundary; ++i)
        {
            if(h > 0)
            {
                int o = comb[h+v-1][h-1];
                if(k > o)
                {
                    ans.append('V');
                    --v;
                    k -= o;
                }
                else
                {
                    ans.append('H');
                    --h;
                }
            }
            else
            {
                ans.append('V');
                --v;
            }
        }

        return ans.toString();
    }
}