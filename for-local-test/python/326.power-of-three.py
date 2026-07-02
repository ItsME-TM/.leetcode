class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        maxPowerOfThree = 3 ** 19
        return n > 0 and maxPowerOfThree % n == 0

if __name__ == "__main__":
    solution = Solution()
    print(solution.isPowerOfThree(27))  # true
    print(solution.isPowerOfThree(0))   # false
    print(solution.isPowerOfThree(9))   # true
    print(solution.isPowerOfThree(45))  # false