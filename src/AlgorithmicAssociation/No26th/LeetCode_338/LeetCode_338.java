package AlgorithmicAssociation.No26th.LeetCode_338;


class Solution {
    public int[] countBits(int num) {
        int[] ans = new int[num+1];
        for(int i = 0; i <= num; ++i)
        {
            int cnt = 0;
            int x = i;
            while(x > 0)
            {
                int y = x & 1;

                if(y == 1)
                {
                    cnt++;
                }
                x = x>>1;
            }
            ans[i] = cnt;
        }

        return ans;
    }
}



public class LeetCode_338
{

}