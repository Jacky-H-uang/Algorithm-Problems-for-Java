// 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
//
// 示例： 
//
// 给定一个链表: 1->2->3->4->5, 和 n = 2.
//
// 当删除了倒数第二个节点后，链表变为 1->2->3->5.
// 
//
// 说明： 
//
// 给定的 n 保证是有效的。 
//
// 进阶： 
//
// 你能尝试使用一趟扫描实现吗？ 
// Related Topics 链表 双指针

  
package LinkedList.leetcode.editor.cn;

import javax.swing.*;

public class LeetCode19_RemoveNthNodeFromEndOfList
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
        // 一次扫描 ，并用 dummy 哑结点来维护删除第一个节点时的情况
        // 时间复杂度：O（L）
        // 空间复杂度：O（1）
        public ListNode removeNthFromEnd(ListNode head, int n)
        {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode l1 = dummy;
            ListNode l2 = dummy;

            for(int i=0;i<n+1;i++)
            {
                l2 = l2.next;
            }
            while (l2 != null)
            {
                l1 = l1.next;
                l2 = l2.next;
            }
            l1 .next = l1.next.next;
            return dummy.next;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) 
    {
        Solution solution = new LeetCode19_RemoveNthNodeFromEndOfList().new Solution();
    }
}

