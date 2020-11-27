package AlgorithmicAssociation.No45th.Interview_1714;

import java.util.*;

public class Solution
{
    public int[] smallestK(int[] arr, int k) {
        Arrays.sort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < arr.length; ++i) {
            if(k > 0)   ans.add(arr[i]);
            else        break;
            k--;
        }

        int[] ret = new int[ans.size()];

        for(int i = 0; i < ans.size(); ++i) {
            ret[i] = ans.get(i);
        }

        return ret;
    }
}