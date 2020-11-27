package AlgorithmicAssociation.No45th.LeetCode_395;


import java.util.*;


public class Solution
{
    // 递归分治
    public int longestSubstring(String s, int k) {
        int[] memo = new int[26];
        for (int i = 0; i < s.length(); i++) {
            memo[s.charAt(i) - 'a']++;
        }

        ArrayList<Integer> aux = new ArrayList<>();

        for (int i = 0; i < s.length(); ++i) {
            if(memo[s.charAt(i)-'a'] < k) {
                aux.add(i);
            }
        }

        if(aux.size() == 0)     return s.length();
        int ans = 0;
        int left = 0;
        aux.add(s.length());
        // 分成区间内的子问题
        for (int i : aux) {
            ans = i > left ? Math.max(ans, longestSubstring(s.substring(left, i), k)) : ans;
            left = i + 1;
        }

        return ans;
    }
}