package AlgorithmicAssociation.No37th.LeetCode_75;


// 方法1：就是计数
// 方法2：双指针 处理 0 和 1 处理完后 2 就是有序的 (类似于三路快排) ---（略）
public class Solution {
    // 计数法：
    public void sortColors(int[] nums) {
        int[] colors = new int [3];
        for(int color : nums){
            colors[color]++;
        }
        int i=0;
        while(colors[0]-->0) nums[i++] = 0;
        while(colors[1]-->0) nums[i++] = 1;
        while(colors[2]-->0) nums[i++] = 2;

    }
}