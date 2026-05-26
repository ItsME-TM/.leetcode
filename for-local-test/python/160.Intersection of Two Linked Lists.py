class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None
class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> ListNode:

        def length(node: ListNode) -> int:
            len = 0
            while node:
                len += 1
                node = node.next
            return len
        lenA = length(headA)
        lenB = length(headB)
        if lenA > lenB:
            for _ in range(lenA - lenB):
                headA = headA.next
        else:
            for _ in range(lenB - lenA):
                headB = headB.next
        while headA is not headB:
            headA = headA.next
            headB = headB.next
        return headA
    
if __name__ == "__main__":
    # Create two linked lists that intersect
    common = ListNode(8)
    common.next = ListNode(10)

    headA = ListNode(3)
    headA.next = ListNode(7)
    headA.next.next = common

    headB = ListNode(99)
    headB.next = ListNode(1)
    headB.next.next = common

    solution = Solution()
    intersection_node = solution.getIntersectionNode(headA, headB)
    if intersection_node:
        print(f"Intersection at node with value: {intersection_node.val}")  # Output: Intersection at node with value: 8
    else:
        print("No intersection found.")