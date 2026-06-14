from typing import Optional


class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        if not head or not head.next:
            return True
        
        # Find the middle of the linked list
        slow, fast = head, head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
        
        # Reverse the second half of the linked list
        second_half_head = self.reverse(slow)
        
        # Compare the first half and the reversed second half
        first_half_head = head
        while second_half_head:
            if first_half_head.val != second_half_head.val:
                return False
            first_half_head = first_half_head.next
            second_half_head = second_half_head.next
        
        return True
    
    def reverse(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        current = head
        while current:
            next_node = current.next
            current.next = prev
            prev = current
            current = next_node
        return prev
    

if __name__ == "__main__":
    solution = Solution()
    head1 = ListNode(1, ListNode(2, ListNode(2, ListNode(1))))
    print(solution.isPalindrome(head1)) # true

    head2 = ListNode(1, ListNode(2))
    print(solution.isPalindrome(head2)) # false