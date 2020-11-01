package AlgorithmicAssociation.No39th.LeetCode_5554;


public class Solution
{
    public boolean canFormArray(int[] arr, int[][] pieces) {
        for(int i = 0; i < pieces.length; ++i)
        {
            boolean flag = false;
            int k = pieces[i].length;
            for(int j = 0; j < arr.length-k+1; ++j)
            {
                int offset = 0;
                boolean tmp = false;
                for(int m : pieces[i])
                {
                    if (m == arr[j + offset])
                    {
                        flag = true;
                        tmp = true;
                    }
                    else
                    {
                        if (tmp == true)  return false;
                        flag = false;
                    }
                    ++offset;
                }
                if(flag == true)        break;
            }
            if(flag == false)       return false;
        }

        return true;
    }
}