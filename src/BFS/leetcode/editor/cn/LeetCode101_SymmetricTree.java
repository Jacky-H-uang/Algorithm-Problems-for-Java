//给定一个二叉树，检查它是否是镜像对称的。
// 
//
// 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。 
//
//     1
//    / \
//   2   2
//  / \ / \
// 3  4 4  3
// 
//
//
// 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的: 
//
//     1
//    / \
//   2   2
//    \   \
//    3    3
// 
//
//
// 进阶：
// 你可以运用递归和迭代两种方法解决这个问题吗？
//
// Related Topics 树 深度优先搜索 广度优先搜索

  
package BFS.leetcode.editor.cn;

public class LeetCode101_SymmetricTree
{
    //leetcode submit region begin(Prohibit modification and deletion)

    //Definition for a binary tree node.
    public class TreeNode
    {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
    }

    class Solution
    {
        public boolean func(TreeNode r1,TreeNode r2)
        {
            if(r1 == null && r2 == null)
            {
                return true;
            }
            if(r1 == null || r2 == null)
            {
                return false;
            }
            return (r1.val == r2.val) && func(r1.left,r2.right) && func(r1.right,r2.left);
        }
        public boolean isSymmetric(TreeNode root)
        {
            if(root == null)
            {
                return true;
            }
            return func(root.left,root.right);
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) 
    {
        Solution solution = new LeetCode101_SymmetricTree().new Solution();
    }
}