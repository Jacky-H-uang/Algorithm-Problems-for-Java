package AlgorithmicAssociation.No43th.LeetCode_406;

import java.lang.reflect.Array;
import java.util.*;

public class Solution
{
    public int[][] reconstructQueue(int[][] people) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        // lambda 表达式对原数组排序
        // 排序规则是：按第一个元素降序排序，如果第一个元素相等则排序按照第二个元素升序排序
        Arrays.sort(people, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]);

        for (int[] p : people)
        {
            int size = ans.size();
            ArrayList<Integer> aux = new ArrayList<>();
            aux.add(p[0]);
            aux.add(p[1]);
            if(p[1] >= size)    ans.add(aux);
            else                ans.add(p[1],aux);
        }

        int[][] res = new int[people.length][2];
        for(int i = 0; i < ans.size(); ++i) {
            res[i][0] = ans.get(i).get(0);
            res[i][1] = ans.get(i).get(1);
        }
        return res;
    }
}