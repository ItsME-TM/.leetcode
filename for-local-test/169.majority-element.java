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

    public static void main(String[] args){
        Solution sol = new Solution();
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(sol.majorityElement(nums));
    }
}

