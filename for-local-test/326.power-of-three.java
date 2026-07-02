class Solution {
    public boolean isPowerOfThree(int n) {
        int maxPowerOfThree = (int) Math.pow(3, 19);
        return n > 0 && maxPowerOfThree % n == 0;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfThree(27)); // true
        System.out.println(solution.isPowerOfThree(0));  // false
        System.out.println(solution.isPowerOfThree(9));  // true
        System.out.println(solution.isPowerOfThree(45)); // false
    }
}


