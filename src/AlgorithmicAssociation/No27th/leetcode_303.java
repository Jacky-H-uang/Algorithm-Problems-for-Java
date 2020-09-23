package AlgorithmicAssociation.No27th;

class NumArray {
    private int[] N;
    public NumArray(int[] nums) {
        if(nums.length == 0)
        {
            return;
        }
        // 前缀和处理
        for(int i = 1; i < nums.length; ++i)
        {
            nums[i] += nums[i-1];
        }
        this.N = nums;
    }

    public int sumRange(int i, int j) {
        if(i == 0)
        {
            return N[j];
        }
        else
        {
            return N[j] - N[i-1];
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */

public class leetcode_303
{
    public static void main(String[] args)
    {

    }
}