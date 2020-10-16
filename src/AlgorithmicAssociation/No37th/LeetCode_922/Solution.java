package AlgorithmicAssociation.No37th.LeetCode_922;
import java.util.*;

// Brute Force  (优化可以用双指针)
public class Solution
{
    public int[] sortArrayByParityII(int[] A) {
        int[] ans = new int[A.length];
        Stack<Integer> stOdd = new Stack<>();
        Stack<Integer> stEven = new Stack<>();

        for(int i = 0; i < A.length; ++i)
        {
            if(A[i] % 2 == 0)       stEven.push(A[i]);       // 偶数放入偶数栈
            else                    stOdd.push(A[i]);        // 奇数放入奇数栈
        }

        for(int i = 0; i < ans.length; ++i)
        {
            if(i%2 == 0)        ans[i] = stEven.pop();
            else                ans[i] = stOdd.pop();
        }

        return ans;
    }
}