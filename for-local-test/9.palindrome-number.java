
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 ) return false;
        if(x % 10 == 0 && x != 0) return false;
        int original = x;
        int reverted = 0;
        while (x / 10 != 0){
            int last = x % 10;
            reverted = reverted * 10 + last;
            x /= 10;
        }
        if (x != 0) {
            reverted = reverted * 10 + x;
        }
        System.out.printf("original: %d, reverted: %d%n", original, reverted);  
        return original == reverted;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] tests = {121, -121, 10, 0, 12321, 1001};
        for (int t : tests) {
            System.out.printf("%d -> %b%n", t, s.isPalindrome(t));
        }
    }
}

