class Solution:
    def isPowerOfFour(self, n: int) -> bool:
        if n <= 0:
            return False
        isPowerOfTwo = (n & (n - 1)) == 0
        return isPowerOfTwo and n % 3 == 1
    
if __name__ == "__main__":
    solution = Solution()
    print(solution.isPowerOfFour(16))  # True
    print(solution.isPowerOfFour(15))  # False
    print(solution.isPowerOfFour(1))   # True
    print(solution.isPowerOfFour(4))   # True
    print(solution.isPowerOfFour(8))   # False