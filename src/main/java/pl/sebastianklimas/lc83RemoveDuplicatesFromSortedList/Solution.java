package pl.sebastianklimas.lc83RemoveDuplicatesFromSortedList;


class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode hook = new ListNode(0, head);

        ListNode current = head.next;
        while (current != null) {
            if (head.val == current.val) {
                head.next = current.next;
                current = current.next;
            } else {
                head = current;
                current = current.next;
            }
        }

        return hook.next;
    }

    /**
     * Definition for singly-linked list.
     */
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
