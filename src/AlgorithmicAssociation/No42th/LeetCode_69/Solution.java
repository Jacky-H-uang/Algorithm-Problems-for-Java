package AlgorithmicAssociation.No42th.LeetCode_69;


// 牛顿迭代法
public class Solution
{
    public int mySqrt(int x) {
        if(x < 2)       return x;
        double x1 = 6;
        double x2 = (x1 + x/x1) / 2.0;
        while(Math.abs(x2 - x1) >= 1)                //收敛
        {
            x1 = x2;
            x2 = (x1+x / x1) / 2.0;
        }
        return (int)x2;
    }
}