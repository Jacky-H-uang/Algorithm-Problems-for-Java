package AlgorithmicAssociation.No41th.Interview_0204;

public class ListNode
{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}



class Solution {
    public ListNode partition(ListNode head, int x) {
        // 用两个链表一个存储小于 x 的，一个存储大于 x的
        ListNode less = new ListNode(0);
        ListNode greater = new ListNode(0);

        ListNode start = less;
        ListNode end = greater;

        while(head != null)
        {
            if(head.val < x)
            {
                less.next = head;
                less = less.next;
            }
            else
            {
                greater.next = head;
                greater = greater.next;
            }
            head = head.next;
        }

        less.next = end.next;
        greater.next = null;

        return start.next;
    }
}