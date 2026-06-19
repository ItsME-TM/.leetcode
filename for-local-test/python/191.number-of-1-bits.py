class Solution:
    def hammingWeight(self, n: int) -> int:
        count = 0
        while n != 0:
            count += 1
            n &= (n - 1)
        return count
    
if __name__ == "__main__":
    solution = Solution()
    n = 11  # Example input
    result = solution.hammingWeight(n)
    print(f"Number of 1 bits in {n} is: {result}")