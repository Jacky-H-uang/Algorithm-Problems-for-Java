// 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
//
// 例如： 
// 给定二叉树 [3,9,20,null,null,15,7],
//
//     3
//    / \
//   9  20
//     /  \
//    15   7
// 
//
// 返回其自底向上的层次遍历为： 
//
// [
//  [15,7],
//  [9,20],
//  [3]
//]
// 
// Related Topics 树 广度优先搜索

  
package BFS.leetcode.editor.cn;
import java.util.*;

public class LeetCode107_BinaryTreeLevelOrderTraversalIi
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
        public List<List<Integer>> levelOrderBottom(TreeNode root)
        {
            List<List<Integer>> l = new ArrayList<>();
            if(root == null)
            {
                return l;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty())
            {
                ArrayList<Integer> arr = new ArrayList<>();
                int size = queue.size();
                for(int i=0;i<size;i++)
                {
                    TreeNode x = queue.remove();
                    arr.add(x.val);
                    if(x.left != null)
                    {
                        queue.add(x.left);
                    }
                    if(x.right != null)
                    {
                        queue.add(x.right);
                    }
                }
                l.add(0,arr);                   // 和正序遍历基本一致，只是最后插入时用头插
            }
            return l;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) 
    {
        Solution solution = new LeetCode107_BinaryTreeLevelOrderTraversalIi().new Solution();
    }
}

