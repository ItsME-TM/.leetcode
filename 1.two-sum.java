/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans = new int[2];
        for(int x=0; x < nums.length; x++){
            for(int y=x+1; y < nums.length; y++){
                if (nums[x]+nums[y] == target){
                    ans[0] = x;
                    ans[1] = y;
                    return ans;
                }
            }
        }
        return null;
    }

    public static void main(String[] args){
        Solution sol = new Solution();
        // Test case 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = sol.twoSum(nums1, target1);
        System.out.println("Test 1: [" + result1[0] + ", " + result1[1] + "]");
        
        // Test case 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = sol.twoSum(nums2, target2);
        System.out.println("Test 2: [" + result2[0] + ", " + result2[1] + "]");
    }
}
// @lc code=end


