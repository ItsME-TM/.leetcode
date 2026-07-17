/*
 * @lc app=leetcode id=405 lang=java
 *
 * [405] Convert a Number to Hexadecimal
 */

// @lc code=start
class Solution {
    public String toHex(int num) {
         if (num == 0) {
            return "0";
        }
        char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            int n = num & 0xf;          
            sb.append(map[n]);
            num = num >>> 4;           
        }
        return sb.reverse().toString(); 
    }
}
// @lc code=end

