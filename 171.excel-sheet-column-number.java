/*
 * @lc app=leetcode id=171 lang=java
 *
 * [171] Excel Sheet Column Number
 */

// @lc code=start
class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (char c : columnTitle.toCharArray()){
            if (c < 'A' || c > 'Z') return -1;
            result =  result * 26 + (c - 'A' + 1);
        }
        return result;
    }
}
// @lc code=end

