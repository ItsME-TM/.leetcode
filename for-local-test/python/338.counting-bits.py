from typing import List

class Solution:
    def countBits(self, n: int) -> List[int]:
        res = [0] * (n + 1)
        for i in range(1, n + 1):
            res[i] = res[i & (i - 1)] + 1
        return res
    
if __name__ == "__main__":
    solution = Solution()
    print(solution.countBits(2))  # [0,1,1]
    print(solution.countBits(5))  # [0,1,1,2,1,2]
