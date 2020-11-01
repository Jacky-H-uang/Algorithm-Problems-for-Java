package AlgorithmicAssociation.No39th.LeetCode_5556;

import java.util.*;

public class Solution
{
    // 利用贪心来选择
    public int furthestBuilding(int[] heights, int bricks, int ladders)
    {
        int n = heights.length;

        // 降序排列 每次都弹出最小的 dif 来用砖块来填充
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>()
        {
            @Override
            public int compare(Integer o1, Integer o2)
            {
                return o1.compareTo(o2);
            }
        });

        int sum = 0;
        for(int i = 1; i < n; ++i)
        {
            if(heights[i-1] < heights[i])
            {
                int dif = heights[i] - heights[i-1];
                pq.add(dif);
                if(pq.size() > ladders)     sum += pq.poll();
            }
            if(sum > bricks)        return i - 1;
        }

        return  n-1;
    }
}