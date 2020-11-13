package AlgorithmicAssociation.No41th.Interview_0202;


// Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


class Solution
{
    public int kthToLast(ListNode head, int k) {
        // 两次扫描: 第一次扫描链表长度，第二次扫描倒数 kth 元素
        ListNode aux = head;
        int cnt = 0;
        while(aux != null)
        {
            cnt++;
            aux = aux.next;
        }

        int t = cnt - k;
        int x = 0;
        while(head != null)
        {
            if(x == t)      return head.val;
            x++;
            head = head.next;
        }

        return head.val;
    }
}