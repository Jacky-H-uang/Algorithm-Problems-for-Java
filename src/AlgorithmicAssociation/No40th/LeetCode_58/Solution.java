package AlgorithmicAssociation.No40th.LeetCode_58;

public class Solution
{
    public int lengthOfLastWord(String s) {
        int cnt = 0;

        char[] ch = s.toCharArray();
        int size = ch.length;
        int start = size-1;

        // 两次扫描
        for(int i = size - 1; i >= 0; --i)
        {
            if(ch[i] == ' ')    continue;
            else
            {
                start = i;
                break;
            }
        }
        for(int i = start; i >= 0; --i)
        {
            if(ch[i] == ' ')    break;
            cnt++;
        }

        return cnt;
    }
}