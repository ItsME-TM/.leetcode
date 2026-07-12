class Solution:
    def firstUniqChar(self, s: str) -> int:
        occurences = [0] * 26
        for c in s:
            occurences[ord(c) - ord('a')] += 1
        for c in s:
            if occurences[ord(c) - ord('a')] == 1:
                return s.index(c)
        return -1

if __name__ == "__main__":
    solution = Solution()
    s = "leetcode"
    result = solution.firstUniqChar(s)
    print(f"The index of the first unique character in \"{s}\" is: {result}")