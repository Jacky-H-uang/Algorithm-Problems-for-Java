// 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
//
// 示例 1:
// 输入: 1->1->2
// 输出: 1->2
// 
//
// 示例 2:
// 输入: 1->1->2->3->3
// 输出: 1->2->3
//
// Related Topics 链表

  
package LinkedList.leetcode.editor.cn;

public class LeetCode83_RemoveDuplicatesFromSortedList
{
    //Definition for singly-linked list.
    public class ListNode
    {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution
    {
        public ListNode deleteDuplicates(ListNode head)
        {
            ListNode dummy = new ListNode(1);
            dummy.next = head;
            ListNode p1 = head;
            ListNode p2 = head;
            while(p2 != null)
            {
                if(p1.val != p2.val)
                {
                    //p1.next = p2;
                    p1 = p2;
                    p2 = p2.next;
                }
                else
                {
                    p2 = p2.next;
                    p1.next = p2;
                }
            }
            return dummy.next;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) 
    {
        Solution solution = new LeetCode83_RemoveDuplicatesFromSortedList().new Solution();
    }
}

