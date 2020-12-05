package AlgorithmicAssociation.No47th.LeetCode_1052;

public class Solution
{
    // Sliding Window
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int ans = 0;
        int sum = 0;
        for(int i = 0; i < customers.length; ++i) {
            if(grumpy[i] == 0) {
                sum += customers[i];
                customers[i] = 0;
            }
        }

        int cnt = customers[0];
        int aux = cnt;
        for(int i = 1; i < customers.length; ++i) {
            if(i < X)           cnt += customers[i];
            else                cnt += customers[i] - customers[i - X];     // 将前一个减去就可以
            aux = Math.max(cnt,aux);
        }
        ans = sum + aux;
        return ans;
    }
}