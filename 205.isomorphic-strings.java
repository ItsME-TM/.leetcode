/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 */

// @lc code=start
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sINt = new HashMap<>();
        Map<Character, Character> tINs = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sINt.containsKey(sChar) && sINt.get(sChar) != tChar) return false;
            if(tINs.containsKey(tChar) && tINs.get(tChar) != sChar) return false;
            sINt.putIfAbsent(sChar, tChar);
            tINs.putIfAbsent(tChar, sChar);
        }
        return true;
    }
}
// @lc code=end

