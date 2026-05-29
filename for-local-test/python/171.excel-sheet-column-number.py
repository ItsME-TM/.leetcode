class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        result = 0
        for c in columnTitle:
            if c < 'A' or c > 'Z':
                return -1
            result = result * 26 + (ord(c) - ord('A') + 1)
        return result

if __name__ == "__main__":
    solution = Solution()
    columnTitle = "AB"
    print(f"Column number for '{columnTitle}': {solution.titleToNumber(columnTitle)}")  # Output: Column number for 'AB': 28
