package AlgorithmicAssociation.No42th.LeetCode_441;

public class Solution
{
    public int arrangeCoins(int n) {
        // 可以用二分
        // 找到一个数 x 使得 ：(1+x) * x / 2 >= n
        int res = 0;
        long sum = 0;
        int left = 1;
        int right = n;
        while (left <= right)
        {
            long mid = left + (right - left)/2;
            sum = mid * (mid + 1) / 2;
            if (sum == n)       return (int)mid;
            else if (sum > n)   right = (int)mid - 1;
            else                left = (int)mid + 1;
        }
        return right;
    }
}