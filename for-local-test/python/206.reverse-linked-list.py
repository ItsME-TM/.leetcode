class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if(head == None):
            return None
        prev = None
        return self.reverseListHelper(prev, head)
    def reverseListHelper(self, prev: ListNode, curr: ListNode) -> ListNode:
        if(curr == None):
            return prev
        temp = curr.next
        curr.next = prev
        return self.reverseListHelper(curr, temp)
    
if __name__ == "__main__":
    solution = Solution()
    head = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
    reversed_head = solution.reverseList(head)
    while(reversed_head != None):
        print(reversed_head.val) # 5 4 3 2 1
        reversed_head = reversed_head.next