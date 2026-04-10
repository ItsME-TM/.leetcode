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
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 1, 2};
        int k1 = sol.removeDuplicates(nums1);
        printResult(nums1, k1);

        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        int k2 = sol.removeDuplicates(nums2);
        printResult(nums2, k2);
    }

    public static void printResult(int[] nums, int k) {
        System.out.print("k = " + k + ", nums = [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
            if (i < k - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
