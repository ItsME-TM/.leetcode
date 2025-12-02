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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null) return null;
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        int num1 = 0;
        int power = 1;
        while(cur1 != null){
            num1 = num1 + cur1.val * power;
            power *= 10;
            cur1 = cur1.next;
        }
        int num2 = 0;
        power = 1;
        while(cur2 != null){
            num2 = num2 + cur2.val * power;
            power *= 10;
            cur2 = cur2.next;
        }
        int sum = num1 + num2;
        ListNode ans = new ListNode(sum % 10);
        ListNode cur = ans;
        sum = sum / 10;
        while(sum > 0){
            cur.next = new ListNode(sum % 10);
            sum = sum / 10;
            cur = cur.next;
        }
        return ans;
    };
    private static void printList(ListNode n){
        while(n != null){
            System.out.print(n.val);
            if(n.next != null) System.out.print(" -> ");
            n = n.next;
        }
        System.out.println();
    }             

    public static void main(String[] args){
        ListNode l1 = ListNode.fromArray(new int[]{2,4,3});
        ListNode l2 = ListNode.fromArray(new int[]{5,6,4});
        Solution s = new Solution();
        ListNode output = s.addTwoNumbers(l1, l2);
        System.out.print("l1: "); printList(l1);
        System.out.print("l2: "); printList(l2);
        System.out.print("Output: "); printList(output);
    }
}


