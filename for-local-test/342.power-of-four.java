class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        boolean isPowerOfTwo = (n & (n - 1)) == 0;
        return isPowerOfTwo && n % 3 == 1;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfFour(16)); // true
        System.out.println(solution.isPowerOfFour(15)); // false
        System.out.println(solution.isPowerOfFour(1));  // true
        System.out.println(solution.isPowerOfFour(4));  // true
        System.out.println(solution.isPowerOfFour(8));  // false
    }
}


