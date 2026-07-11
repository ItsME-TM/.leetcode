class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        count = [0] * 26
        for c in magazine:
            count[ord(c) - ord('a')] += 1
        for c in ransomNote:
            if count[ord(c) - ord('a')] == 0:
                return False
            count[ord(c) - ord('a')] -= 1
        return True
    
if __name__ == "__main__":
    solution = Solution()
    ransomNote = "a"
    magazine = "ba"
    result = solution.canConstruct(ransomNote, magazine)
    print(result)  # Output: True