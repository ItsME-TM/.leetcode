
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class SolutionCurrent {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args){
        SolutionCurrent SolutionCurrent = new SolutionCurrent();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        ListNode result = SolutionCurrent.deleteDuplicates(head);
        for (ListNode p = result; p != null; p = p.next) {
            System.out.print(p.val);
            if (p.next != null) System.out.print(" -> ");
        }
        System.out.println();
    }
}

