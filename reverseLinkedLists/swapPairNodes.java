/*
  Time: O(n)
  Space: O(1)
*/

public ListNode swapPairs(ListNode head) {
    if(head == null)
        return head;
    
    ListNode dummy = new ListNode(0);
    dummy.next = head;

    ListNode prev = dummy;
    ListNode current = prev.next;
    ListNode next = current.next;

    while(current != null && next != null) {
        prev.next = next;
        current.next = next.next;
        next.next = current;

        prev = current;
        current = prev.next;
        if(current == null)
            next = null;
        else
            next = current.next;
    }

    return dummy.next;
}
