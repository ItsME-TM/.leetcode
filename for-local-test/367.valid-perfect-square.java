
class Solution {
    public boolean isPerfectSquare(int num) {
        if (num > 0 && num < 4) return true;
        long left = 1;
        long right = num;
        while(left <= right){
            long mid = left + (right - left) / 2;
            long square = mid * mid;
            if (square == num) return true;
            else if (square < num) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = 16;
        boolean result = solution.isPerfectSquare(num);
        System.out.println("Is " + num + " a perfect square? " + result);
    }
}



