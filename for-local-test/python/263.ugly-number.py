class Solution:
    def isUgly(self, n: int) -> bool:
        if n <= 0:
            return False
        for p in [2, 3, 5]:
            while n % p == 0:
                n //= p
        return n == 1
if __name__ == "__main__":
    solution = Solution()
    print(solution.isUgly(6))  # true
    print(solution.isUgly(8))  # true
    print(solution.isUgly(14))  # false