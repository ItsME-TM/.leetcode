class Solution:
    def __init__(self):
        self.memory = [0] * 46

    def climbStairs(self, n: int) -> int:
        if n == 1:
            return 1
        if n == 2:
            return 2
        if self.memory[n] != 0:
            return self.memory[n]
        ways = self.climbStairs(n - 1) + self.climbStairs(n - 2)
        self.memory[n] = ways
        return ways
    
if __name__ == "__main__":
    solution = Solution()
    print(solution.climbStairs(1))
    print(solution.climbStairs(2))
    print(solution.climbStairs(3))
    print(solution.climbStairs(4))
    print(solution.climbStairs(5))
    print(solution.climbStairs(6))
    print(solution.climbStairs(7))
    print(solution.climbStairs(8))
    print(solution.climbStairs(9))
    print(solution.climbStairs(10))
         