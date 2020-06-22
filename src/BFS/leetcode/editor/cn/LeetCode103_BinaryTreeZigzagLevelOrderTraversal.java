// 给定一个二叉树，返回其节点值的锯齿形层次遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
//
//  例如：
// 给定二叉树 [3,9,20,null,null,15,7],
//
//     3
//    / \
//   9  20
//     /  \
//    15   7
// 
//
// 返回锯齿形层次遍历如下：
//
// [
//  [3],
//  [20,9],
//  [15,7]
// ]
// 
// Related Topics 栈 树 广度优先搜索

  
package BFS.leetcode.editor.cn;
import java.util.*;

public class LeetCode103_BinaryTreeZigzagLevelOrderTraversal
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
        public List<List<Integer>> zigzagLevelOrder(TreeNode root)
        {
            if(root == null)
            {
                return new ArrayList<List<Integer>>();
            }
            List<List<Integer>> l = new ArrayList<List<Integer>>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty())
            {
                ArrayList<Integer> arr = new ArrayList<>();
                int size = queue.size();
                while (size > 0)
                {
                    TreeNode x = queue.poll();              // 删除第一个元素
                    if(l.size() % 2 ==0)
                    {
                        arr.add(x.val);
                    }
                    else
                    {
                        arr.add(0,x.val);
                    }
                    if(x.left != null)
                    {
                        queue.add(x.left);
                    }
                    if(x.right != null)
                    {
                        queue.add(x.right);
                    }
                    size--;
                }
                l.add(arr);
            }
            return l;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) 
    {
        Solution solution = new LeetCode103_BinaryTreeZigzagLevelOrderTraversal().new Solution();
    }
}

