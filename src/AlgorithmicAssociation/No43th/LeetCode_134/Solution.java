package AlgorithmicAssociation.No43th.LeetCode_134;

public class Solution
{
    // 遍历每个点如果遇到不行的换下一个点，直至遍历完成所有的点
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        int ans = 0;
        int tank = 0;
        int index = 0;
        while(index < gas.length)
        {
            // 只需要计算每次的耗油
            sum += gas[index] - cost[index];
            tank += gas[index] - cost[index];
            if(tank < 0)
            {
                tank = 0;
                ans = index + 1;
            }
            index += 1;
        }
        if(sum < 0)     return -1;
        return tank >= 0? ans : -1;
    }
}