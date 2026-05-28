from typing import List


class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        majority = nums[0]
        count = 0
        for num in nums:
            if count == 0:
                majority = num
            if num == majority:
                count += 1
            else:
                count -= 1
        return majority

if __name__ == "__main__":
    solution = Solution()
    nums = [2,2,1,1,1,2,2]
    print(f"Majority element: {solution.majorityElement(nums)}")  # Output: Majority element: 2