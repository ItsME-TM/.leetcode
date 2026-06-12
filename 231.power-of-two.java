/*
 * @lc app=leetcode id=231 lang=java
 *
 * [231] Power of Two
 */

// @lc code=start
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        if(n == 1) return true;
        long powerOfTwo = 1;
        while (powerOfTwo < n){
            powerOfTwo *= 2;
            if(powerOfTwo == n) return true;
        }
        return false;
    }
}
// @lc code=end

