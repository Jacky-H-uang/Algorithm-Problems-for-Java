package AlgorithmicAssociation.No31th.LeetCode_0412;


// Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


class Solution {
    private int ans = 0;
    private void dfs(TreeNode r,int target) {
        if(r == null)       return;
        target -= r.val;
        if(target == 0)     ans++;

        dfs(r.left,target);
        dfs(r.right,target);
    }
    public int pathSum(TreeNode root, int sum) {
        if(root == null)        return 0;
        dfs(root,sum);

        // 每次 dfs() 都更新开始节点
        pathSum(root.left,sum);
        pathSum(root.right,sum);

        return ans;
    }
}