class Solution:
    def mySqrt(self, x: int) -> int:
        if x == 0:
            return 0
        result = 0
        left, right = 1, x
        while  left <= right:
            mid = left + (right - left) // 2
            if mid * mid == x:
                return mid
            elif mid * mid < x:
                result = mid
                left = mid + 1
            else:
                right = mid - 1
        return result
    
if __name__ == "__main__":
    solution = Solution()
    print(solution.mySqrt(0))
    print(solution.mySqrt(1))
    print(solution.mySqrt(4))
    print(solution.mySqrt(8))
    print(solution.mySqrt(84376589))