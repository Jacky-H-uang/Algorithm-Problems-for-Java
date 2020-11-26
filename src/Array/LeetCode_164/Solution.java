package Array.LeetCode_164;

import java.util.*;

public class Solution
{
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        if(nums.length <= 1)        return 0;
        int ans = 0;
        for (int i = 1; i < nums.length; ++i)
        {
            if(nums[i] - nums[i-1] > ans)   ans = nums[i] - nums[i-1];
        }

        return ans;
    }
}