package AlgorithmicAssociation.No40th.LeetCode_896;

public class Solution
{
    public boolean isMonotonic(int[] A) {
        boolean f1 = true;      // increasing flag
        boolean f2 = true;      // decreasing flag

        for(int i = 1; i < A.length; ++i)
        {
            if(A[i-1] > A[i])     f1 = false;
            if(A[i-1] < A[i])     f2 = false;
        }

        return f1 || f2;
    }
}