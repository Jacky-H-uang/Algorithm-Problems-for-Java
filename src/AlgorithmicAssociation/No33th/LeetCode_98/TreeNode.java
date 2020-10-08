package AlgorithmicAssociation.No33th.LeetCode_98;

import java.util.*;

public class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


// 二叉搜索树的性质：中序遍历出来是一个递增的数组
class Solution {
    private ArrayList<Integer> arr = new ArrayList<>();

    // dfs() 构造出中序遍历数组
    private void dfs(TreeNode root) {
        if(root != null)
        {
            dfs(root.left);
            arr.add(root.val);
            dfs(root.right);
        }
    }
    public boolean isValidBST(TreeNode root) {
        // 注意取值方法
        double cmp = -Double.MAX_VALUE;
        dfs(root);
        for(int i : arr)
        {
            if (cmp < i)        cmp = i;
            else                return false;
        }

        return true;
    }
}