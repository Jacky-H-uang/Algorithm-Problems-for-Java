package AlgorithmicAssociation.No46th.LeetCode_1207;

import java.util.*;

public class Solution
{
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        Set<Integer> cnt = new HashSet<>();
        for(int a : arr) {
            if(hashMap.containsKey(a))  hashMap.put(a,hashMap.get(a) + 1);
            else                        hashMap.put(a,1);
        }

        for(Map.Entry<Integer,Integer> it : hashMap.entrySet()) {
            cnt.add(it.getValue());
        }

        return cnt.size() == hashMap.size();
    }
}