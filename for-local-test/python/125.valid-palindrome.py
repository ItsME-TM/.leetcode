class Solution:
    def isPalindrome(self, s: str) -> bool:
        if s is None or len(s) == 0:
            return True
        cleaned = ''.join(ch.lower() for ch in s if ch.isalnum())
        first = 0
        last = len(cleaned) - 1
        while first < last:
            if cleaned[first] != cleaned[last]:
                return False
            first += 1
            last -= 1
        return True
    
if __name__ == "__main__":
    solution = Solution()
    print(solution.isPalindrome("A man, a plan, a canal: Panama"))  # Output: True
    print(solution.isPalindrome("race a car"))  # Output: False

        
            
