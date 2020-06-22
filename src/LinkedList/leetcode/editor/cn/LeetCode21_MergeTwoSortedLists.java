//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
//
// 示例： 
//
// 输入：1->2->4, 1->3->4
// 输出：1->1->2->3->4->4
// 
// Related Topics 链表

  
package LinkedList.leetcode.editor.cn;

import java.util.List;

public class LeetCode21_MergeTwoSortedLists
{

    // Definition for singly-linked list.
    public class ListNode
    {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution
    {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2)
        {
            ListNode dummy_Node = new ListNode();
            ListNode curr = dummy_Node;
            while (l1 != null && l2 != null)
            {
                if(l1.val < l2.val)
                {
                    curr.next = l1;
                    l1 = l1.next;
                }
                else
                {
                    curr.next = l2;
                    l2 = l2.next;
                }
                curr = curr.next;
            }
            curr.next = l1 != null?l1:l2;
            return dummy_Node.next;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) 
    {
        Solution solution = new LeetCode21_MergeTwoSortedLists().new Solution();
    }
}

