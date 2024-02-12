package easy;

class ListNode {
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

class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2)));

        System.out.print("Input: ");
        printList(head); // Output: 1 1 2

        ListNode result = deleteDuplicates(head);
        System.out.print("\nOutput: ");
        printList(result); // Output: 1 2

    }

    private static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    //helper method
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

}