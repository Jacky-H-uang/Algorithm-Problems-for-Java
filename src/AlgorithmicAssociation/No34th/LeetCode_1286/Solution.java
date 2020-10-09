package AlgorithmicAssociation.No34th.LeetCode_1286;
import java.util.*;


public class Solution
{
    class CombinationIterator {
        int[] pos;
        String s;
        boolean finished;
        public CombinationIterator(String characters, int combinationLength) {
            s = characters;
            pos =  new int[combinationLength];
            for(int i = 0;i < pos.length;++i)       pos[i] = i;
            finished = false;
        }

        public String next() {
            String ans ="";
            for(int p:pos)      ans += s.charAt(p);

            int i = -1;
            for (int k = pos.length - 1; k >= 0; --k)
            {
                if (pos[k] != s.length() - pos.length + k)
                {
                    i = k;
                    break;
                }
            }
            if (i == -1)
            {
                finished = true;
            }
            else
            {
                ++pos[i];
                for (int j = i + 1; j < pos.length; ++j)
                {
                    pos[j] = pos[j - 1] + 1;
                }
            }
            return ans;
        }

        public boolean hasNext() {
            return !finished;
        }
    }

    /**
     * Your CombinationIterator object will be instantiated and called as such:
     * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
     * String param_1 = obj.next();
     * boolean param_2 = obj.hasNext();
     */
}
