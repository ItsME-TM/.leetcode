class Solution {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 4; // Example input
        boolean result = solution.canWinNim(n);
        System.out.println("Can win Nim with " + n + " stones: " + result);
    }
}


