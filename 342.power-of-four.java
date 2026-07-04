/*
 * @lc app=leetcode id=342 lang=java
 *
 * [342] Power of Four
 */

// @lc code=start
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        boolean isPowerOfTwo = (n & (n - 1)) == 0;
        return isPowerOfTwo && n % 3 == 1;
    }
}
// @lc code=end

