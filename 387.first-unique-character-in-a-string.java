/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        int occurrences[] = new int[26];
        for (char c : s.toCharArray()){
            occurrences[c - 'a']++;
        }
        for (char c : s.toCharArray()){
            if(occurrences[c - 'a'] == 1) return s.indexOf(c);
        }
        return -1;
    }
}
// @lc code=end

