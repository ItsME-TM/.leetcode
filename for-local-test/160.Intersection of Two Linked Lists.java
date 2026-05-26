import java.util.Set;
import java.util.LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = length(headA);
        int lenB = length(headB);
        if (lenA > lenB){
            for(int i = 0; i < lenA - lenB; i++){
                headA = headA.next;
            }
        }else{
            for(int i = 0; i < lenB - lenA; i++){
                headB = headB.next;
            }
        }
        while (headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
    public int length(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    public static void main(String[] args) {
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);
        ListNode headB = new ListNode(4);
        headB.next = headA.next;
        Solution solution = new Solution();
        ListNode intersection = solution.getIntersectionNode(headA, headB);
        if (intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.val);
        } else {
            System.out.println("No intersection.");
        }
    }
}

