package leetCode75;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null; // At the start, `prev` is null because the new head's next will be null.
        ListNode current = head; // Start with the head of the list.
        while (current != null) {
            ListNode next = current.next; // Save next node.
            current.next = prev; // Reverse the current node's pointer.
            prev = current; // Move `prev` and `current` one step forward.
            current = next;
        }
        return prev; // At the end, `prev` is the new head of the reversed list.
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
