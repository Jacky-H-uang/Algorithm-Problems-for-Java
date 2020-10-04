package AlgorithmicAssociation.No31th.LeetCode_865;



// Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    private int helper(TreeNode root) {
        if(root == null)        return 0;
        else                    return Math.max(helper(root.left),helper(root.right)) + 1;
    }
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if(root == null)
        {
            return null;
        }
        else
        {
            int lMaxDepth = helper(root.left);
            int rMaxDepth = helper(root.right);

            if(lMaxDepth == rMaxDepth)              return root;
            else if(lMaxDepth > rMaxDepth)          return subtreeWithAllDeepest(root.left);
            else                                    return subtreeWithAllDeepest(root.right);
        }
    }
}