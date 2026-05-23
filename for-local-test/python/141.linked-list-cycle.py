class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def hasCycle(self, head: ListNode) -> bool:
        if not head:
            return False
        
        slow = head
        fast = head.next
        while slow and fast and fast.next:
            if slow == fast:
                return True
            
            slow = slow.next
            fast = fast.next.next

        return False

#Why use if __name__ == "__main__":? This condition ensures that the code inside the block only runs when the file is executed directly, not when it's imported as a module. 
if __name__ == "__main__":
    # Create a linked list with a cycle
    head = ListNode(3)
    node2 = ListNode(2)
    node0 = ListNode(0)
    node4 = ListNode(-4)

    head.next = node2
    node2.next = node0
    node0.next = node4
    node4.next = node2  # Creates a cycle

    solution = Solution()
    print(solution.hasCycle(head))  # Output: True

    # Create a linked list without a cycle
    head2 = ListNode(1)
    node2_2 = ListNode(2)

    head2.next = node2_2
    node2_2.next = None  # No cycle

    print(solution.hasCycle(head2))  # Output: False