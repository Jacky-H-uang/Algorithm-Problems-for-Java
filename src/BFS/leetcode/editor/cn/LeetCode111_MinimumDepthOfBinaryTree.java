//给定一个二叉树，找出其最小深度。
//
// 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。 
//
// 说明: 叶子节点是指没有子节点的节点。 
//
// 示例: 
//
// 给定二叉树 [3,9,20,null,null,15,7], 
//
//     3
//    / \
//   9  20
//     /  \
//    15   7
//
// 返回它的最小深度 2. 
// Related Topics 树 深度优先搜索 广度优先搜索

  
package BFS.leetcode.editor.cn;

public class LeetCode111_MinimumDepthOfBinaryTree
{
    //leetcode submit region begin(Prohibit modification and deletion)

  // Definition for a binary tree node.
    public class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    class Solution
    {
        public int minDepth(TreeNode root)
        {
            if(root == null)
            {
                return 0;
            }
            if(root.left == null && root.right ==null)
            {
                return 1;
            }
            int depth = Integer.MAX_VALUE;
            if(root.left != null)
            {
                depth = Math.min(minDepth(root.left),depth);
            }
            if(root.right != null)
            {
                depth = Math.min(minDepth(root.right),depth);
            }
            return depth+1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) 
    {
        Solution solution = new LeetCode111_MinimumDepthOfBinaryTree().new Solution();
    }
}

