
from typing import List


class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        count_map = {}
        for num in nums1:
            count_map[num] = count_map.get(num, 0) + 1
        
        result = []
        for num in nums2:
            if num in count_map and count_map[num] > 0:
                result.append(num)
                count_map[num] -= 1
        
        return result
    
if __name__ == "__main__":
    solution = Solution()
    nums1 = [1, 2, 2, 1]
    nums2 = [2, 2]
    result = solution.intersect(nums1, nums2)
    print(f"Input: nums1 = {nums1}, nums2 = {nums2}")
    print(f"Output: {result}")  # Output: [2, 2]