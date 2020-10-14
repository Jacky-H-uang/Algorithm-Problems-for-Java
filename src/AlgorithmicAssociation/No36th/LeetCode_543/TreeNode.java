package AlgorithmicAssociation.No36th.LeetCode_543;

import com.sun.source.tree.Tree;

// Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


// 求树或图的直径,两次 dfs 或者 bfs 都行
class Solution {
    private int ans;

    // 两次 dfs 来求以每个点为根节点的直径
    private int dfs1(TreeNode root) {
        if(root == null)        return 0;
        return Math.max(1+dfs1(root.left),dfs1(root.right) +1);
    }
    private void dfs2(TreeNode root) {
        if(root == null)        return;
        int L = dfs1(root.left);
        int R = dfs1(root.right);
        ans = Math.max(L+R,ans);
        dfs2(root.left);
        dfs2(root.right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)        return 0;
        dfs2(root);

        return ans;
    }
}