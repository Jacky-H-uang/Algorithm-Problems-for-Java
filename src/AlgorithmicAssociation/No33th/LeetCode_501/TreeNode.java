package AlgorithmicAssociation.No33th.LeetCode_501;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    private HashMap<Integer,Integer> arr = new HashMap<>();
    private ArrayList<Integer> aux = new ArrayList<>();

    // dfs() 构造出中序遍历数组
    private void dfs(TreeNode root) {
        if(root != null)
        {
            dfs(root.left);
            dfs(root.right);
            if(!arr.containsKey(root.val))      arr.put(root.val,1);
            else
            {
                int temp = arr.get(root.val);
                arr.put(root.val,temp+1);
            }
        }
    }

    // 统计众数的个数
    public void computeNum() {
        int cnt = 0;
        int cntMax = 0;
        for(Integer x : arr.keySet())
        {
            if (arr.get(x) > cnt)
            {
                aux.clear();
                aux.add(x);
                cnt = arr.get(x);
            }
            else if (arr.get(x) == cnt)
            {
                aux.add(x);
            }
        }
    }

    public int[] findMode(TreeNode root) {
        dfs(root);
        computeNum();
        int[] ans = new int[aux.size()];
        for(int i = 0; i < ans.length; ++i)    ans[i] = aux.get(i);

        return ans;
    }
}