package AlgorithmicAssociation.No26th.LeetCode_1025;


class Solution {
    public boolean divisorGame(int N) {
        if(N == 1)
        {
            return false;
        }
        else if(N % 2 == 1)
        {
            return false;
        }
        else{
            return true;
        }
    }
}


public class LeetCode_1025
{
}
