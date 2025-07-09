/*
  In order to reverse a Linked List withou using extra space, the best application would be
    to use 3 pointers:
    - current
    - previous
    - next

  Steps:
    1) Initializing variables
      - current = head
      - prev & next = null (because we'll return prev)

    2) while(current != null)
      - pointing to left
        - move next to the next node from current
        - make current to point to prev
      - slide pointers to right
        - prev = current
        - current = next

    3) return prev since at the end current will point to null
      - in the case that head starts null, perv already would
        be null

  Time: O(n) since it's an iteration through the whole list 
    with n nodes

  Space: O(1) since it's constant space of the list
*/
public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public ListNode reverseList(ListNode head) {
  ListNode current = head;
  ListNode prev = null;
  ListNode next = null;

  while(current != null) {
    next = current.next;

    current.next = prev;

    prev = current;

    current= next;
  }

  return prev;
}
