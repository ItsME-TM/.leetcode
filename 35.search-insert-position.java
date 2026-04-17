/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int front = 0;
        int back = nums.length - 1;
        int middle = 0;
        while (front <= back){
            middle = (front + back) / 2;
            if (nums[middle] == target) return middle;
            else if (nums[middle] < target) front = middle + 1;
            else back = middle - 1;
        }
        return front;
    }
}
// @lc code=end

