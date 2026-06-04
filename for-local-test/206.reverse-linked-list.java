
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode prev = null;
        return reverseListHelper(prev, head);
    }
    public ListNode reverseListHelper(ListNode prev, ListNode curr){
        if(curr == null) return prev;
        ListNode temp = curr.next;
        curr.next = prev;
        return reverseListHelper(curr, temp);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode reversedHead = sol.reverseList(head);
        while(reversedHead != null) {
            System.out.print(reversedHead.val + " ");
            reversedHead = reversedHead.next;
        }
    }
}


