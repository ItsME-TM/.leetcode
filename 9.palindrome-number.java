/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 ) return false;
        if(x % 10 == 0 && x != 0) return false;
        int original = x;
        int reverted = 0;
        while (x / 10 != 0){
            int last = x % 10;
            reverted = reverted * 10 + last;
            x /= 10;
        }
        if (x != 0) {
            reverted = reverted * 10 + x;
        }
        return original == reverted;
    }
}
// @lc code=end

