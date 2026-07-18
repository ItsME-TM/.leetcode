class Solution:
    def longestPalindrome(self, s: str) -> int:
        count = [0] * 128
        for char in s:
            count[ord(char)] += 1
        result = 0
        hasOdd = False
        for c in count:
            if c % 2 == 0:
                result += c
            else:
                result += c - 1
                hasOdd = True
        return result * 2 + (1 if hasOdd else 0)
    
if __name__ == "__main__":
    solution = Solution()
    input_str = "abccccdd"
    longest_palindrome_length = solution.longestPalindrome(input_str)
    print("Longest Palindrome Length:", longest_palindrome_length)