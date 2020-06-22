//给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。 
//
//
// 示例： 
//二叉树：[3,9,20,null,null,15,7], 
//
//     3
//    / \
//   9  20
//     /  \
//    15   7
// 
//
// 返回其层次遍历结果： 
//
// [
//  [3],
//  [9,20],
//  [15,7]
//]
// 
// Related Topics 树 广度优先搜索

  
package BFS.leetcode.editor.cn;
import java.util.*;

public class LeetCode102_BinaryTreeLevelOrderTraversal
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

     // 用到 BFS + LinkedList (模拟 Queue)
    class Solution
    {
        public List<List<Integer>> levelOrder(TreeNode root)
        {
            if(root == null)
            {
                return new ArrayList<List<Integer>>();
            }
            TreeNode temp = root;
            List<List<Integer>> l = new ArrayList<List<Integer>>();
            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty())
            {
                ArrayList<Integer> t = new ArrayList<>();
                int size = queue.size();
                for(int i=0;i<size;i++)
                {
                    TreeNode x = queue.remove();
                    t.add(x.val);
                    if(x.left != null)
                    {
                        queue.add(x.left);
                    }
                    if(x.right != null)
                    {
                        queue.add(x.right);
                    }
                }
                l.add(t);
            }
            return l;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) 
    {
        Solution solution = new LeetCode102_BinaryTreeLevelOrderTraversal().new Solution();
    }
}

