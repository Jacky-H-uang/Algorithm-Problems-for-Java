// 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
//
// 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。 
//
// 
//
// 示例: 
//
// 给定 1->2->3->4, 你应该返回 2->1->4->3.
// 
// Related Topics 链表

  
package LinkedList.leetcode.editor.cn;

public class LeetCode24_SwapNodesInPairs
{
    // Definition for singly-linked list.
    public class ListNode
    {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution
    {
        // Recursive 方法: 从后往前思考
        public ListNode swapPairs(ListNode head)
        {
            // 递归出口
            if(head == null || head.next == null)
            {
                return head;
            }

            ListNode next = head.next;
            head.next = swapPairs(next.next);
            next.next = head;
            return next;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) 
    {
        Solution solution = new LeetCode24_SwapNodesInPairs().new Solution();
    }
}

