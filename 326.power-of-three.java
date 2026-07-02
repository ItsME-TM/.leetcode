/*
 * @lc app=leetcode id=326 lang=java
 *
 * [326] Power of Three
 */

// @lc code=start
class Solution {
    public boolean isPowerOfThree(int n) {
        int maxPowerOfThree = (int) Math.pow(3, 19);
        return n > 0 && maxPowerOfThree % n == 0;
    }
}
// @lc code=end

