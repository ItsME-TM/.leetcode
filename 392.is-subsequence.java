/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        for (int j = 0; j < t.length(); j++){
            if(i < s.length() && s.charAt(i) == t.charAt(j)){
                i++;
            }
        }
        return i == s.length();
    }
}
// @lc code=end

