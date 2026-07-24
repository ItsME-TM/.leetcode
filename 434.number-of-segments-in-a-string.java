/*
 * @lc app=leetcode id=434 lang=java
 *
 * [434] Number of Segments in a String
 */

// @lc code=start
class Solution {
    public int countSegments(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' '){
                count++;
                while (i < s.length() && s.charAt(i) == ' '){
                    i++;
                }
            }
        }
        return count + 1;
    }
}
// @lc code=end

