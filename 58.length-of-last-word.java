/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        if(s.isEmpty()) return 0;
        int lastIndex = s.length() - 1;
        while(lastIndex >= 0 && s.charAt(lastIndex) == ' '){
            lastIndex--;
        }
        int lastWordLength = 0;
        while(lastIndex >= 0 && s.charAt(lastIndex) != ' ') {
            lastIndex--;
            lastWordLength++;
        }
        return lastWordLength;
    }
}
// @lc code=end

