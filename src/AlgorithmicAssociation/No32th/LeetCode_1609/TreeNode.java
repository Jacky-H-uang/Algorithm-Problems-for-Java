package AlgorithmicAssociation.No32th.LeetCode_1609;
import java.util.*;


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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        while(!q.isEmpty())
        {
            int valEven = 1000001;        // 偶数
            int valOdd = 0;               // 奇数
            int size = q.size();
            while(size-- > 0)
            {
                TreeNode tmp = q.poll();
                // 奇数层: 全是偶数且递减
                if(level % 2 != 0)
                {
                    if(tmp.val % 2 == 0 && tmp.val < valEven)   valEven = tmp.val;
                    else                                        return false;
                }
                // 偶数层：全是奇数且递增
                else
                {
                    if(tmp.val % 2 != 0 && tmp.val > valOdd)    valOdd = tmp.val;
                    else                                        return false;
                }
                if(tmp.left != null)    q.add(tmp.left);
                if(tmp.right != null)   q.add(tmp.right);
            }
            level++;
        }

        return true;
    }
}