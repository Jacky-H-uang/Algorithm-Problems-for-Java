package AlgorithmicAssociation.No46th.LCP_17;

public class Solution
{
    public int calculate(String s) {
        if(s.equals(""))        return 1;
        int ans = 1;
        for(int i = 0; i < s.length(); ++i) {
            ans *= 2;
        }

        return ans;
    }
}