/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0];
        int count = 0;
        for (int num : nums){
            if (count == 0) majority = num;
            if(num == majority) count++;
            else count--;
        }
        return majority;
    }
}
// @lc code=end

