class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        char_count = {}
        
        for char in s:
            char_count[char] = char_count.get(char, 0) + 1
        
        for char in t:
            if char not in char_count or char_count[char] == 0:
                return False
            char_count[char] -= 1
        
        return True
    
if __name__ == "__main__":
    solution = Solution()
    s1 = "anagram"
    t1 = "nagaram"
    print(solution.isAnagram(s1, t1)) # true

    s2 = "rat"
    t2 = "car"
    print(solution.isAnagram(s2, t2)) # false