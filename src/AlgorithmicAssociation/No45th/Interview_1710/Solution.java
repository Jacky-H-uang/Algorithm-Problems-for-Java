package AlgorithmicAssociation.No45th.Interview_1710;


public class Solution
{
    public int majorityElement(int[] nums) {
        int cnt = 1;
        int ans = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            if(ans != nums[i]) {
                cnt--;
            }
            else{
                cnt++;
            }
            if(cnt < 0) {
                ans = nums[i];
                cnt = 1;
            }
        }

        int c = 0;
        for (int x : nums)
        {
            if(x == ans)      c++;
        }

        if(cnt > 0 && c > nums.length / 2)     return ans;
        return -1;
    }
}