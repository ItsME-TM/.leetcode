/*
 * @lc app=leetcode id=168 lang=java
 *
 * [168] Excel Sheet Column Title
 */

// @lc code=start
class Solution {
    public String convertToTitle(int columnNumber) {
        if(columnNumber == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0){
            sb.append((char)('A' + (columnNumber - 1) % 26));
            columnNumber = (columnNumber - 1) / 26;
        }
        return sb.reverse().toString();
    }
}
// @lc code=end

