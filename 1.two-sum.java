
import java.util.HashMap;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> valueMap = new HashMap<>();
        for(int x=0; x < nums.length; x++){
            int difference = target - nums[x];
            if(valueMap.containsKey(difference)) return new int[]{valueMap.get(difference),x}; 
            valueMap.put(nums[x], x);
        }
        throw new IllegalArgumentException("No two sum solution");
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


