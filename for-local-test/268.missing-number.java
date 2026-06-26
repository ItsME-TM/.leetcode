
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for(int num : nums){
            sum -= num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 0, 1};
        int missingNumber = solution.missingNumber(nums);
        System.out.println("Missing number: " + missingNumber); // Output: Missing number: 2
    }
}
