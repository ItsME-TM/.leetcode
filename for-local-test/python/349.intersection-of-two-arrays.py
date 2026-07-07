from typing import List


class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        set1 = set(nums1)
        set2 = set(nums2)
        return list(set1 & set2)
    
if __name__ == "__main__":
    solution = Solution()
    nums1 = [1, 2, 2, 1]
    nums2 = [2, 2]
    result = solution.intersection(nums1, nums2)
    print(f"Input: nums1 = {nums1}, nums2 = {nums2}")
    print(f"Output: {result}")  # Output: [2]