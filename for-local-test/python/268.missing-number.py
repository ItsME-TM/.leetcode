class Solution:
    def missingNumber(self, nums: list[int]) -> int:
        n = len(nums)
        total_sum = n * (n + 1) // 2
        actual_sum = sum(nums)
        return total_sum - actual_sum

if __name__ == "__main__":
    solution = Solution()
    nums = [3, 0, 1]
    missing_number = solution.missingNumber(nums)
    print(f"Missing number: {missing_number}")  # Output: Missing number: 2P