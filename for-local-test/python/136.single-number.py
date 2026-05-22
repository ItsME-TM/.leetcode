from typing import List


class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        result = 0
        for num in nums:
            # XOR operation
            result ^= num
        return result
    
if __name__ == "__main__":
    solution = Solution()
    nums = [4, 1, 2, 1, 2]
    result = solution.singleNumber(nums)
    print(result)  # Output: 4