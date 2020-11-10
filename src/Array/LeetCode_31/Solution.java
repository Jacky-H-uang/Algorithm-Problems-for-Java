package Array.LeetCode_31;


import java.util.Arrays;

public class Solution
{
    // 交换元素位置
    private void change(int[] nums , int i,int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // 反转数组
    private void reverse(int[] nums) {
        int[] aux = nums.clone();
        for(int i = 0; i < nums.length; ++i)
        {
            nums[i] = aux[nums.length-i-1];
            //System.out.println(nums[i]);
        }
    }

    // 二分查找
    private int binarySearch(int[] nums,int L,int R,int K) {
        int mid = (R+L)/2;
        int ans = L;
        while (L <= R)
        {
            mid = (R+L)/2;
            if(nums[mid] > K)
            {
                ans = mid;
                L = mid+1;
            }
            else if(nums[mid] == K)     R = mid-1;
            else                        R = mid-1;
        }

        return ans;
    }

    public void nextPermutation(int[] nums)
    {
        int len = nums.length;
        int ptr = len-1;
        int maxV = nums[ptr];
        for (int i = len-1; i >= 0; --i)
        {
            if(nums[i] > maxV)          maxV = nums[i];
            else if(nums[i] == maxV);
            else{
                ptr = i;
                break;
            }
        }

        if(ptr == len-1)
        {
            reverse(nums);
            return;
        }
        int X = binarySearch(nums,ptr+1,nums.length-1,nums[ptr]);

        change(nums,ptr,X);

        Arrays.sort(nums,ptr+1,nums.length);
    }
}