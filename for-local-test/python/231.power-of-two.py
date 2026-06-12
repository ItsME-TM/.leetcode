class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        if n <= 0:
            return False
        if n == 1:
            return True
        power_of_two = 1
        while power_of_two < n:
            power_of_two *= 2
            if power_of_two == n:
                return True
        return False
    
if __name__ == "__main__":
    solution = Solution()
    n = 16
    print(solution.isPowerOfTwo(n))
    