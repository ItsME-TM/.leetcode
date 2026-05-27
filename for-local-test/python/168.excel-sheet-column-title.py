class Solution:
    def convertToTitle(self, columnNumber: int) -> str:
        if columnNumber == 0:
            return ""
        result = []
        while columnNumber > 0:
            result.append(chr(ord('A') + (columnNumber - 1) % 26))
            # Reason for use // instead of / is that we want to get the quotient as an integer, not a float
            # in python 3, the / operator always returns a float, even if both operands are integers. 
            # The // operator performs floor division, which means it returns the largest integer less than or equal to the result of the division.
            columnNumber = (columnNumber - 1) // 26
        return "".join(reversed(result))
    
if __name__ == "__main__":
    solution = Solution()
    columnNumber = 28
    title = solution.convertToTitle(columnNumber)
    print(f"Column number: {columnNumber}, Column title: {title}")  # Output: Column number: 28, Column title: AB