/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = 1;
        if (nums == null || nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length - 1; i++) { 
            if (nums[i] != nums[i + 1]) {
                nums[n] = nums[i + 1];
                n++;
            }
        }
        return n;
    }
}
// @lc code=end

