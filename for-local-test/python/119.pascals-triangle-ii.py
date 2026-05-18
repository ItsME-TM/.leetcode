from typing import List


class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        # Initialize the row with 1's
        row = []
        for i in range(rowIndex + 1):
            row.append(1)
        for i in range(1, rowIndex + 1):
            for j in range(i - 1, 0, -1):
                row[j] = row[j] + row[j - 1]
        return row

if __name__ == "__main__":
    solution = Solution()
    print(solution.getRow(5))
