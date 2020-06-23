// 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 示例：
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
// 输出：7 -> 0 -> 8
// 原因：342 + 465 = 807
// 
// Related Topics 链表 数学

  
package LinkedList.leetcode.editor.cn;

public class LeetCode2_AddTwoNumbers
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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2)
        {
            ListNode dummy_head = new ListNode(0);
            ListNode curr = dummy_head;
            ListNode p1 = l1;
            ListNode p2 = l2;
            int carry = 0;
            while (p1 != null || p2 != null)
            {
                int x = p1!=null?p1.val:0;
                int y = p2!=null?p2.val:0;
                int temp = x+y+carry;
                carry = temp / 10;
                curr.next = new ListNode(temp%10);
                curr = curr.next;
                if(p1 != null)      p1 = p1.next;
                if(p2 != null)      p2 = p2.next;
            }
            if(carry != 0)
            {
                curr.next = new ListNode(carry);
            }
            return dummy_head.next;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) 
    {
        Solution solution = new LeetCode2_AddTwoNumbers().new Solution();
    }
}

