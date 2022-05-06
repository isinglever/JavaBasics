import basics.ListNode;

public class reverseListNode {
    public ListNode recur(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = recur(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }
    
    public ListNode twoPointerI(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next  = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}
