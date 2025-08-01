/*
  Time: O(n)
  Space: O(1)
*/

public ListNode reverseBetween(ListNode head, int left, int right) {
    if(head == null || left == right)
        return head;

    ListNode first = new ListNode(0);
    first.next = head;

    ListNode prev = first;

    for(int i = 0; i < left - 1; i++) 
        prev = prev.next;

    ListNode current = prev.next;

    for(int i = 0; i < right - left; i++) {
        ListNode temp = current.next;
        current.next = temp.next;
        temp.next = prev.next;
        prev.next = temp;
    }

    return first.next;
}
