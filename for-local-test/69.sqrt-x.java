
class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        long left = 1, right = x;
        int result = 0;
        while (left <= right){
            long mid = left + (right - left) / 2;
            if (mid * mid == x) return (int) mid;
            else if (mid * mid < x){
                result = (int) mid;
                left = mid + 1;
            }
            else right = mid - 1;
        }
        return result;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.mySqrt(0));
        System.out.println(solution.mySqrt(1));
        System.out.println(solution.mySqrt(4));
        System.out.println(solution.mySqrt(8));
        System.out.println(solution.mySqrt(84376589));
    }
}


