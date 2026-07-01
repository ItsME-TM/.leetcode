/*
 * @lc app=leetcode id=303 lang=java
 *
 * [303] Range Sum Query - Immutable
 */

// @lc code=start
class NumArray {
    private int[] calcSum;

    public NumArray(int[] nums) {
        calcSum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++){
            calcSum[i + 1] = calcSum[i] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return calcSum[right + 1] - calcSum[left];
    }
}


/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
// @lc code=end

