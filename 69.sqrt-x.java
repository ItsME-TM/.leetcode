/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        long left = 1, right = x;
        int result = 0;
        while (left <= right){
            long mid = left + (right - left) / 2;
            if (mid * mid == x) return (int) mid;
            else if (mid * mid < x){
                result = (int) mid;
                left = mid + 1;
            }
            else right = mid - 1;
        }
        return result;
    }
}
// @lc code=end

