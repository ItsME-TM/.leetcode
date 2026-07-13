class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        sum = 0
        for c in t:
            sum += ord(c)
        for c in s:
            sum -= ord(c)
        return chr(sum)

if __name__ == "__main__":
    solution = Solution()
    s = "abcd"
    t = "abcde"
    result = solution.findTheDifference(s, t)
    print(f"The extra character in \"{t}\" compared to \"{s}\" is: '{result}'")