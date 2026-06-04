/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
}
// @lc code=end

