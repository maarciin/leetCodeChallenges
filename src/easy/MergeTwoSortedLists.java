package easy;

class MergeTwoSortedLists {
    public static void main(String[] args) {
        // Create the first list: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // Create the second list: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        // Call the mergeTwoLists function
        ListNode mergedList = mergeTwoLists(list1, list2);

        // Print the merged list
        printList(mergedList);
    }

    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to start the merged list
        ListNode returnNode = new ListNode(0);
        ListNode headNode = returnNode;

        // Compare and merge the nodes
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                returnNode.next = list1;
                list1 = list1.next;
            } else {
                returnNode.next = list2;
                list2 = list2.next;
            }
            returnNode = returnNode.next;
        }

        // Attach the remaining nodes if any
        returnNode.next = (list1 == null) ? list2 : list1;

        // The merged list starts from the next of the dummy node
        return headNode.next;
    }

    // Helper method to print the linked list
    private static void printList(ListNode head) {
        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    //Definition for singly-linked list.

    public static class ListNode {
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
