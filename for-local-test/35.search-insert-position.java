
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

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, 5, 6};
        int target = 3;
        int result = solution.searchInsert(nums, target);
        System.out.println(result); // Output: 1
    }
}


