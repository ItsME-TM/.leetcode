class Solution {
    public int removeElement(int[] nums, int val) {
        int length = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[length] = nums[i];
                length++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = sol.removeElement(nums1, val1);
        System.out.println("k = " + k1);
    }
}

