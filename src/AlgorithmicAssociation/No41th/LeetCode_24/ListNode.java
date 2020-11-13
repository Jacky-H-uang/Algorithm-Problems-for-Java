package AlgorithmicAssociation.No41th.LeetCode_24;


public class ListNode
{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    // 递归来交换元素
    private ListNode swap(ListNode head)
    {
        if(head == null || head.next == null)       return head;

        ListNode temp = head.next;
        head.next = head.next.next;
        temp.next = head;
        head = temp;
        head.next.next = swap(head.next.next);
        return head;
    }

    public ListNode swapPairs(ListNode head)
    {
        return swap(head);
    }
}