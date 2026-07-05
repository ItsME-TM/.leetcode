class Solution:
    def reverseString(self, s: list[str]) -> None:
        if s is None or len(s) <= 1:
            return
        left = 0
        right = len(s) - 1
        while left < right:
            s[left], s[right] = s[right], s[left]
            left += 1
            right -= 1

if __name__ == "__main__":
    solution = Solution()
    test_string = ['h', 'e', 'l', 'l', 'o']
    solution.reverseString(test_string)
    print(test_string)  # Output: ['o', 'l', 'l', 'e', 'h']