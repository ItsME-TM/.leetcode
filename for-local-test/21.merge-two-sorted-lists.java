
class Solution {
    public static class ListNode{
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}

        public static ListNode fromArray(int[] vals){
            if(vals == null || vals.length == 0) return null;
            ListNode head = new ListNode(vals[0]);
            ListNode cur = head;
            for(int i = 1; i < vals.length; i++){
                cur.next = new ListNode(vals[i]);
                cur = cur.next;
            }
            return head;
        }
    }

    // Utility to print the linked list
    public static void printList(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val);
            if (cur.next != null) System.out.print(" -> ");
            cur = cur.next;
        }
        System.out.println();
    }
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        ListNode head = new ListNode(0);
        ListNode tail = head;
        while (list1 != null && list2 != null){
            if(list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
            }else{
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        //connect any remaining nodes
        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }
        return head.next;
    }

    public static void main(String[] args) {
        // Example test cases
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {1, 3, 4};
        ListNode l1 = ListNode.fromArray(arr1);
        ListNode l2 = ListNode.fromArray(arr2);
        Solution sol = new Solution();
        ListNode merged = sol.mergeTwoLists(l1, l2);
        System.out.print("Merged List: ");
        printList(merged);
    }
}

