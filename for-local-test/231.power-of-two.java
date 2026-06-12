
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        if(n == 1) return true;
        long powerOfTwo = 1;
        while (powerOfTwo < n){
            powerOfTwo *= 2;
            if(powerOfTwo == n) return true;
        }
        return false;
    }
    //
    public boolean isPowerOfTwoBitwise(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfTwo(1)); // true
        System.out.println(solution.isPowerOfTwo(16)); // true
        System.out.println(solution.isPowerOfTwo(3)); // false
        System.out.println(solution.isPowerOfTwoBitwise(1)); // true
        System.out.println(solution.isPowerOfTwoBitwise(16)); // true
        System.out.println(solution.isPowerOfTwoBitwise(3)); // false
    }
}

