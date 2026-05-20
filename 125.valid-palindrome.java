/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0){
            return true;
        }
        String str = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int lastIndex = str.length() - 1;
        int firstIndex = 0;
        while (firstIndex < lastIndex){
            if(str.charAt(firstIndex) != str.charAt(lastIndex)) return false;
            firstIndex++;
            lastIndex--;
        }
        return true;
    }
}
// @lc code=end

