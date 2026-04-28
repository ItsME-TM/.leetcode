/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode noDuplicate = head;
        while(noDuplicate.next != null && noDuplicate != null){
            if(noDuplicate.next.val == noDuplicate.val){
                noDuplicate.next = noDuplicate.next.next;
            }else{
                noDuplicate = noDuplicate.next;
            }
        }
        return head;
    }
}
// @lc code=end

