class Solution:
    def thirdMax(self, nums: list[int]) -> int:
        unique_nums = set(nums)
        if len(unique_nums) < 3:
            return max(unique_nums)
        else:
            sorted_nums = sorted(unique_nums, reverse=True)
            return sorted_nums[2]
        
if __name__ == "__main__":
    solution = Solution()
    nums = [3, 2, 1]
    result = solution.thirdMax(nums)
    print(result)  # Output: 1