from typing import List


class Solution:
    def pascalTriangle(self, numRows: int) -> List[List[int]]:
        result = []
        for i in range(1, numRows + 1):
            cRow = []
            # First 1
            cRow.append(1)
            # Middel numbers
            for j in range(1, i - 1):
                cRow.append(result[i-2][j] + result[i-2][j-1])
            # Last 1
            if i > 1:
                cRow.append(1)
            result.append(cRow)
        return result
    
if __name__ == "__main__":
    solution = Solution()
    print(solution.pascalTriangle(5))