class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        if num > 0 and num < 4:
            return True
        left, right = 2, num
        while left <= right:
            mid = left + (right - left) // 2
            square = mid * mid
            if square == num:
                return True
            elif square < num:
                left = mid + 1
            else:
                right = mid - 1
        return False
    
if __name__ == "__main__":
    solution = Solution()
    num = 16
    result = solution.isPerfectSquare(num)
    print(f"Is {num} a perfect square? {result}")  # Output: True