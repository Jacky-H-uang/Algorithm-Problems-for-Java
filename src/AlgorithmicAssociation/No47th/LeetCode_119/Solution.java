package AlgorithmicAssociation.No47th.LeetCode_119;

import java.util.*;


public class Solution
{
    // 递归得到之前的数组
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex == 0) {
            List<Integer> arr = new ArrayList<>();
            arr.add(1);
            return arr;
        }
        if(rowIndex == 1) {
            List<Integer> arr = new ArrayList<>();
            arr.add(1);
            arr.add(1);
            return arr;
        }

        List<Integer> arr = getRow(rowIndex-1);
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        for(int i = 1; i < rowIndex; ++i) {
            ans.add(arr.get(i-1) + arr.get(i));
        }
        ans.add(1);
        return ans;
    }
}