package AlgorithmicAssociation.No47th.LeetCode_915;


public class Solution
{
    public int partitionDisjoint(int[] A) {
        int ans = 0;

        int maxVal = A[0];
        int auxMaxVal = maxVal;

        for(int i = 0; i < A.length; ++i) {
            maxVal = Math.max(maxVal,A[i]);
            if(A[i] < auxMaxVal) {
                auxMaxVal = maxVal;
                ans = i;
            }
        }

        return ans + 1;
    }
}