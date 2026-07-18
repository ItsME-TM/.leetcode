/*
 * @lc app=leetcode id=409 lang=java
 *
 * [409] Longest Palindrome
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        int result = 0;
        boolean hasOdd = false;
        for (int c : count){
            if (c % 2 == 0) {
                result += c / 2;
            } else{
                result += c / 2;
                hasOdd = true;
            }
        }
        return result * 2 + (hasOdd ? 1 : 0);
    }
}
// @lc code=end

