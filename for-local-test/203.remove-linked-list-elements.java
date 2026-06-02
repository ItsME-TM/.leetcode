class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode curr = node;
        if (curr.next == null) return head;
        while (curr.next != null){
            if (curr.next.val == val){
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return node.next;
    }
    public static void main(String[] args) {
        ListNode node1 = new ListNode(7);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(7);
        ListNode node4 = new ListNode(7);
        ListNode node5 = new ListNode(7);
        ListNode node6 = new ListNode(7);
        ListNode node7 = new ListNode(7);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        Solution solution = new Solution();
        

        // Print the linked list after removing elements
        ListNode current = solution.removeElements(node1, 7);
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}

