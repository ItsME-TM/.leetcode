
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

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1}; // Example input
        NumArray numArray = new NumArray(nums);
        int left = 0; // Example left index
        int right = 2; // Example right index
        int result = numArray.sumRange(left, right);
        System.out.println("Sum of range [" + left + ", " + right + "] is: " + result);
    }
}


