package AlgorithmicAssociation.No42th.LeetCode_1152;

import java.util.*;

public class Solution
{
    public boolean check(int[] p,int mid,int m)
    {
        int count = 1;
        int i = 0;
        for(int j = 1; j < p.length; ++j)
        {
            if(p[j]-p[i] >= mid)
            {
                i = j;
                count++;
                if(count >= m)      return true;
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);

        int L = 1;

        // 摆放距离的最大距离的最小值 （有点绕，不过好理解，就是尽可能的让两个球间的间距相等的间距）
        int R = (position[position.length-1]-position[0]) / (m-1);

        int ans = 0;
        while(L <= R)
        {
            int mid = (L+R)/2;
            if(check(position,mid,m))
            {
                ans = mid;
                L = mid+1;
            }
            else    R = mid-1;
        }
        return ans;
    }
}