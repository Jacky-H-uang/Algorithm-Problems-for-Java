package AlgorithmicAssociation.No40th.LeetCode_287;

import java.util.*;

public class Solution
{
    // extra space
    public int findDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int i = 0; i < nums.length; ++i)
        {
            if(st.contains(nums[i]))        return nums[i];
            st.add(nums[i]);
        }

        return -1;
    }

    // O(1) space
    public int findDuplicate2(int[] nums) {
        int L = 1,R = nums.length;
        int ans = 0;
        while (L <= R) {
            int mid = (L+R)>>1;
            int cnt = 0;
            for(int i = 0; i < nums.length; ++i)
            {
                if(nums[i] <= mid)      cnt++;
            }
            if(cnt <= mid)      L = mid+1;
            else
            {
                R = mid-1;
                ans = mid;
            }
        }

        return ans;
    }
}